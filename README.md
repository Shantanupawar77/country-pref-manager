# 🌍 Country Pref Manager – SharedPreferences Demo

A simple Android app that demonstrates how to **save and retrieve data using SharedPreferences**.  
The user enters a country name, saves it, and the value remains stored even after reopening the app.

This project is perfect for beginners learning persistent key–value storage in Android.

> ⚠️ **Note:** This project includes only the basic SharedPreferences logic.  
> More features and UI improvements will be added later.

---

## 📥 Download APK

👉 **APK Link:**  
https://drive.google.com/file/d/138EP2O1skkwEsF5AGL6pnTD5fM2qW4bW/view

---

## 🚀 Features

### 💾 SharedPreferences Usage  
- Save country name locally  
- Retrieve stored data on app launch  
- Uses `apply()` for asynchronous saving  
- Demonstrates persistent key–value storage  

### 🎨 UI & Interaction  
- EditText for entering the country  
- Save button  
- TextView displaying saved country  
- Clean, minimal UI using ViewBinding  

### 🧠 How It Works  
- Loads SharedPreferences with:  
  `getSharedPreferences("MyPrefs", MODE_PRIVATE)`  
- Saves user input using:  
  `prefs.edit().putString("country", countryName).apply()`  
- Displays previously stored value automatically.

---

## 📌 Future Enhancements  
- Clear / delete saved country  
- Material 3 UI redesign  
- Use DataStore (modern alternative to SharedPreferences)  
- Add multiple fields (state, city, language, etc.)  
- Dark mode support  

---

## 🤝 Contributing  
Feel free to fork and extend this project.  
Pull requests are welcome!

---

## ⭐ Support  
If you learned something from this project, please give it a **⭐ on GitHub**!
