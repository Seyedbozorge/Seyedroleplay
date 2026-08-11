package com.seyed.roleplay.launcher.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.seyed.roleplay.launcher.R

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val edtUsername = findViewById<EditText>(R.id.edtRegUsername)
        val edtPassword = findViewById<EditText>(R.id.edtRegPassword)
        val btnRegisterSubmit = findViewById<Button>(R.id.btnRegisterSubmit)

        btnRegisterSubmit.setOnClickListener {
            val user = edtUsername.text.toString().trim()
            val pass = edtPassword.text.toString().trim()

            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "لطفاً تمام فیلدها را پر کنید", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "حساب کاربری با موفقیت ساخته شد!", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }
}
