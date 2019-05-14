package yamamura.kouki.techacademy.kotlinlog
import android.util.Log

public class Hobby(var gamename: String, var difficulty: String, var recommended: String){
    init{
        //
    }
    fun GameRecommended(){
        Log.d("test",this.gamename + "の難易度は" + this.difficulty + "度で,おすすめ度は" + this.recommended + "です。")
    }
}