package yamamura.kouki.techacademy.kotlinlog
import android.util.Log

public class Human: Animal , Thinkable{
    var hobby:String

    constructor(name:String, age:Int, hobby:String):super(name,age){
        this.hobby = hobby
    }
    override fun say(){
        Log.d("test","「私の名前は" + this.name + "です。年は" + this.age + "歳です。」")
    }

    override fun think(){
        Log.d("test","「私は" + this.hobby +"について考える」")
    }
}