package com.example.sharedprefencesdemo

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sharedprefencesdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  private val prefsName = "MyPrefs"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    enableEdgeToEdge()
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
      insets
    }
    val prefs = getSharedPreferences(prefsName, Context.MODE_PRIVATE)

    val savedCountry = prefs.getString("country", "")
    if (!savedCountry.isNullOrEmpty()) {
      binding.tvCountry.text = "Country: $savedCountry"
    }

    binding.btnSave.setOnClickListener {
      val countryName = binding.etCountry.text.toString().trim()
      if (countryName.isNotEmpty()) {
        prefs.edit().putString("country", countryName).apply()
        binding.tvCountry.text = "Country: $countryName"
        binding.etCountry.text.clear()
      }
    }
  }
}
