package com.example.helloworld

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_register.setOnClickListener {
            if(et_email.text.isNullOrBlank()||et_pwd.text.isNullOrBlank())
                Toast.makeText(this,"아이디와 비밀번호를 확인하세요",Toast.LENGTH_SHORT).show()
            else{
                val intent = Intent()
                Log.d("RegisterActivity", et_email.text.toString())
                intent.putExtra("email", et_email.text.toString())
                intent.putExtra("pwd", et_pwd.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
