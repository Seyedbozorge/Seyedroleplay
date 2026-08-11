package com.seyed.roleplay.launcher.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.seyed.roleplay.launcher.R

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val edtPlayerName = findViewById<EditText>(R.id.edtPlayerName)
        val btnSaveSettings = findViewById<Button>(R.id.btnSaveSettings)

        btnSaveSettings.setOnClickListener {
            val name = edtPlayerName.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(this, "لطفاً نام مستعار خود را وارد کنید", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "تنظیمات با موفقیت ذخیره شد!", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }
}
