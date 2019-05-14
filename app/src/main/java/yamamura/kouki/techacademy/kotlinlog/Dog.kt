package yamamura.kouki.techacademy.kotlinlog
import android.util.Log

open public class Dog: Animal , Movable{
    constructor(name:String, age:Int):super(name,age)

    override fun say(){
        Log.d("test",this.name + "は、今年で" + this.age+"歳になりました。" )
    }

    override fun move() {
        Log.d("test",this.name + "は、とても足が速い")
    }


}