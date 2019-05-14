package yamamura.kouki.techacademy.kotlinlog
import android.telephony.mbms.MbmsErrors
import android.util.Log

public class Hobby2(var name: String, var age: Int){
    init{
        //
    }
    fun say(){
        Log.d("test",this.name + "は今年で" + this.age + "歳です。")
    }
}
