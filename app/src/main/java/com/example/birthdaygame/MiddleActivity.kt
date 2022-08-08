package com.example.birthdaygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_middle.*
import java.util.Random

class MiddleActivity : AppCompatActivity() {
    private fun randomday():String{
        //val random = Random()
        val a = random.nextInt(12) + 1
        var b = 0
        when {
            a == 1 -> b = random.nextInt(31) + 1
            a == 2 -> b = random.nextInt(28) + 1
            a == 3 -> b = random.nextInt(31) + 1
            a == 4 -> b = random.nextInt(30) + 1
            a == 5 -> b = random.nextInt(31) + 1
            a == 6 -> b = random.nextInt(30) + 1
            a == 7 -> b = random.nextInt(31) + 1
            a == 8 -> b = random.nextInt(31) + 1
            a == 9 -> b = random.nextInt(30) + 1
            a == 10 -> b = random.nextInt(31) + 1
            a == 11 -> b = random.nextInt(30) + 1
            a == 12 -> b = random.nextInt(31) + 1
        }
        val c :String = "$a 월 $b 일"
        return c
    }

    private fun case_1(name:String){

        var answer : String = ""

        when {
            name == "변지수" -> answer = "3 월 16 일"
            name == "윤태성" -> answer = "3 월 2 일"
            name == "이현정" -> answer = "12 월 19 일"
            name == "김길호" -> answer = "6 월 18 일"
            name == "신정섭" -> answer = "3 월 13 일"
            name == "황인욱" -> answer = "5 월 6 일"
            name == "정승환" -> answer = "8 월 28 일"
            name == "김진규" -> answer = "1 월 17 일"
            name == "김형석" -> answer = "11 월 7 일"
            name == "한초롱" -> answer = "2 월 6 일"
            name == "강승호" -> answer = "2 월 12 일"
            name == "김서아" -> answer = "12 월 7 일"
            name == "이지혜" -> answer = "3 월 20 일"
            name == "김용호" -> answer = "5 월 9 일"
            name == "김현광" -> answer = "8 월 23 일"
            name == "류경아" -> answer = "12 월 28 일"
            name == "박동희" -> answer = "4 월 1 일"
            name == "박민준" -> answer = "10 월 14 일"
            name == "박주영" -> answer = "5 월 20 일"
            name == "신유완" -> answer = "5 월 14 일"
            name == "이승환" -> answer = "11 월 16 일"
            name == "이인욱" -> answer = "9 월 9 일"
            name == "장동욱" -> answer = "4 월 13 일"
            name == "허재은" -> answer = "7 월 3 일"
            name == "조규원" -> answer = "3 월 2 일"
            name == "조재현" -> answer = "1 월 3 일"
            name == "최형진" -> answer = "11 월 22 일"
            name == "함영원" -> answer = "2 월 11 일"
            name == "홍현정" -> answer = "3 월 6 일"
            name == "이호정" -> answer = "12 월 8 일"
            name == "김민석" -> answer = "6 월 30 일"
            name == "최태현" -> answer = "2 월 2 일"
            name == "신유주" -> answer = "1 월 24 일"
            name == "강찬규" -> answer = "2 월 17 일"
            name == "이선호" -> answer = "4 월 17 일"
            name == "서동민" -> answer = "6 월 21 일"
            name == "장성훈" -> answer = "7 월 23 일"
            else -> nametext2.text = "잘못입력"
        }

        button1.text = answer
        button2.text = randomday()

        button1.setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("result","통과")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("result","드세요")
            startActivity(intent)
        }



    }

    private fun case_2(name:String){

        var answer : String = ""

        when {
            name == "변지수" -> answer = "3 월 16 일"
            name == "윤태성" -> answer = "3 월 2 일"
            name == "이현정" -> answer = "12 월 19 일"
            name == "김길호" -> answer = "6 월 18 일"
            name == "신정섭" -> answer = "3 월 13 일"
            name == "황인욱" -> answer = "5 월 6 일"
            name == "정승환" -> answer = "8 월 28 일"
            name == "김진규" -> answer = "1 월 17 일"
            name == "김형석" -> answer = "11 월 7 일"
            name == "한초롱" -> answer = "2 월 6 일"
            name == "강승호" -> answer = "2 월 12 일"
            name == "김서아" -> answer = "12 월 7 일"
            name == "이지혜" -> answer = "3 월 20 일"
            name == "김용호" -> answer = "5 월 9 일"
            name == "김현광" -> answer = "8 월 23 일"
            name == "류경아" -> answer = "12 월 28 일"
            name == "박동희" -> answer = "4 월 1 일"
            name == "박민준" -> answer = "10 월 14 일"
            name == "박주영" -> answer = "5 월 20 일"
            name == "신유완" -> answer = "5 월 14 일"
            name == "이승환" -> answer = "11 월 16 일"
            name == "이인욱" -> answer = "9 월 9 일"
            name == "장동욱" -> answer = "4 월 13 일"
            name == "허재은" -> answer = "7 월 3 일"
            name == "조규원" -> answer = "3 월 2 일"
            name == "조재현" -> answer = "1 월 3 일"
            name == "최형진" -> answer = "11 월 22 일"
            name == "함영원" -> answer = "2 월 11 일"
            name == "홍현정" -> answer = "3 월 6 일"
            name == "이호정" -> answer = "12 월 8 일"
            name == "김민석" -> answer = "6 월 30 일"
            name == "최태현" -> answer = "2 월 2 일"
            name == "신유주" -> answer = "1 월 24 일"
            name == "강찬규" -> answer = "2 월 17 일"
            name == "이선호" -> answer = "4 월 17 일"
            name == "서동민" -> answer = "6 월 21 일"
            name == "장성훈" -> answer = "7 월 23 일"
            else -> nametext2.text = "잘못입력"
        }

        button2.text = answer
        button1.text = randomday()

        button1.setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("result","드세요")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("result","통과")
            startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_middle)

        var name = intent.getStringExtra("name")

        nametext2.setText(name)

        val random = Random()
        val d = random.nextInt(2)
        when{
            d == 0 -> case_1(name)
            else -> case_2(name)
        }
    }
}
