package com.example.figmadisigne

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun logIn(view: View) {
        if(findViewById<EditText>(R.id.emailTxt).text.isNotEmpty()&&findViewById<EditText>(R.id.passTxt).text.isNotEmpty())
        {

            val intent = Intent (this@Login, Main::class.java)
            startActivity(intent)
            finish()
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }
}