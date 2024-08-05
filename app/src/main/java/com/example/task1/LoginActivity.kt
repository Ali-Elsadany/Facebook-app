package com.example.task1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editEmail : EditText = findViewById(R.id.email)
        val editPassword : EditText = findViewById(R.id.password)

        val loginButton : Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener{
            val email = editEmail.text.toString().trim()
            val password = editPassword.text.toString().trim()

            if (email.isEmpty() && password.isEmpty()){
                Toast.makeText(this, "Please Enter Your Email And Password", Toast.LENGTH_SHORT ).show()
            }
            else if(email.isEmpty()){
                Toast.makeText(this, "Please Enter Your Email", Toast.LENGTH_SHORT).show()
            }
            else if(password.isEmpty()){
                Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show()
            }
            else if(!isValidGmail(email)){
                Toast.makeText(this, "Please Enter Valid Gmail address", Toast.LENGTH_SHORT).show()
            }
            else {
                val intent = Intent(this, FacebookHomeActivity::class.java)
                startActivity(intent)

            }

        }

    }

    private fun isValidGmail(email: String): Boolean{
        return email.endsWith("@gmail.com",true)
    }

}