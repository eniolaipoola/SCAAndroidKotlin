/**
 * Copyright (c) 2020 Adediji Adeyinka(tdscientist)
 * All rights reserved
 * Created on 10-Jan-2020
 */
class Author {

    var username: String = "eipoola"
    var age: Int = 25
    var sex: String = "female"


    fun User(username:String, age:Int, sex:String) : Author{
        val result = Author()
        return result
    }

    private data class User(var username: String, var age: Int = 0, var sex: String = "", var email: String = "")
}