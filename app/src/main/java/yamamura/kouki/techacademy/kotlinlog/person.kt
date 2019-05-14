package yamamura.kouki.techacademy.kotlinlog
import android.util.Log

class person {
    //propertyを作成
    var name : String
    var age: Int
    var sex: String

    constructor(name:String, age:Int, sex:String){
        this.name = name
        this.age = age
        this.sex = sex
    }
    fun say(){
        Log.d("test","彼の名前は"+this.name+"、年齢は"+this.age+"歳で、"+"性別は"+this.sex+"性です")
    }
}