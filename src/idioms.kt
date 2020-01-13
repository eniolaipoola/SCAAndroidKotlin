import java.io.File

/**
 * Copyright (c) 2020 Adediji Adeyinka(tdscientist)
 * All rights reserved
 * Created on 13-Jan-2020
 */

/** Transversing a map/list of pairs*/
fun transverseMap(){
    val map = mapOf<Int, String>(1 to "Eniola", 2 to "Segun", 3 to "Opeyemi")
    for((k, v) in map){
        println("$k -> $v")
    }

    for(k in map.keys){
        println(map.keys)
    }

    //read only list
    val list = listOf("a", "b", "c")

    //read only map
    val map2 = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map2["key"])
   // map2["key"] = value


    //if not null shorthand
    val files = File("Test").listFiles()
    println(files?.size)

    //if not null else shorthand
    val filesElse = File("Test").listFiles()
    println(files?.size ?: "File is empty")

    //executing a full if statement
    val values = listOf("eniola", "segun", "ope")
    val names = values[1] ?: throw IllegalStateException("Nothing happened")
    println(names)
}


