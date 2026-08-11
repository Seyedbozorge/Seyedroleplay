package com.seyed.roleplay.launcher.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.seyed.roleplay.launcher.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtStatus = findViewById<TextView>(R.id.txtServerStatus)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        // نمایش وضعیت سرور ثابت سید رول پلی (Open.MP)
        txtStatus.text = "🟢 سرور آنلاین است\nIP: 65.108.36.172:19121"

        // دکمه ورود به بازی
        btnPlay.setOnClickListener {
            Toast.makeText(this, "در حال اتصال به سرور 65.108.36.172:19121...", Toast.LENGTH_LONG).show()
        }

        // دکمه ورود به حساب کاربری (رفتن به صفحه Login)
        btnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // دکمه ثبت‌نام (رفتن به صفحه Register)
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // دکمه تنظیمات
        btnSettings.setOnClickListener {
            Toast.makeText(this, "تنظیمات لانچر سید رول پلی", Toast.LENGTH_SHORT).show()
        }
    }
}
