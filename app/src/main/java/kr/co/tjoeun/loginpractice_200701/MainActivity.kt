package kr.co.tjoeun.loginpractice_200701

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val inputId = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

            if (inputId == "admin@admin.com" && inputPw.equals("123456") ) {

            Toast.makeText(this, "관리자 입니다.", Toast.LENGTH_SHORT).show()
        }
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()

            }
        }

    }


}