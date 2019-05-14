package yamamura.kouki.techacademy.kotlinlog

abstract public class Animal{
    var name: String
    var age: Int

    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }
    abstract fun say()

}