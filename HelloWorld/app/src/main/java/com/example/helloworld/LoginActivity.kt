package com.example.helloworld

import android.R.attr.key
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /**sharedPreferences 데이터 로드**/
        val prefs = this.getSharedPreferences("prefs",0)
        et_email.setText(prefs.getString("email", ""))
        et_pwd.setText(prefs.getString("password", ""))

        txt_register.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivityForResult(intent,101)
        }

        btn_login.setOnClickListener{
            if(et_email.text.isNullOrBlank()||et_pwd.text.isNullOrBlank())
                Toast.makeText(this,"아이디와 비밀번호를 확인하세요",Toast.LENGTH_SHORT).show()
            else{
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 101 && resultCode == Activity.RESULT_OK ){
            val email = data?.getStringExtra("email")
            val pwd = data?.getStringExtra("pwd")

            if(!email.isNullOrEmpty() && !pwd.isNullOrEmpty()){
                et_email.setText(email.toString())
                et_pwd.setText(pwd.toString())

                /**sharedPreferences 데이터 저장**/
                val prefs = this.getSharedPreferences("prefs",0)
                val editor = prefs.edit()
                editor.putString("email", email.toString()) //putBoolean, putInt, putLong 등 데이터타입에 따라 사용
                editor.putString("pwd", pwd.toString())
                editor.commit()
            }
        }
    }
}
