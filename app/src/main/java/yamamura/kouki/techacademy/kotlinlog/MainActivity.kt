package yamamura.kouki.techacademy.kotlinlog

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("山村",27, "野球")
        human.say()
        human.think()

        val human2 = Human("上杉",27,"剣道")
        human2.say()
        human.think()




    }


}