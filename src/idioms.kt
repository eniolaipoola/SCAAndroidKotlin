import java.io.File

/**
 * Copyright (c) 2020 Eniola Ipoola
 * All rights reserved
 * Created on 13-Jan-2020
 */

fun main(){
    transverseMap()
    filterList()
}

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


    //nullability in lists
    var marbles : Int ? = null
    var lotOfFish: List<String?> = listOf(null, null)
    var moreFish: List<Int> ? = null

    //allow both list and elements to be null
    var allFish: List<String?> ? = null
    allFish = listOf(null, null)
}

fun filterList(){
    val list = listOf( 1, 2, 3)
    val positives = list.filter{it > 0 }
    val positives2 = list.filter{ x -> x > 0 }
    println("filter list method returns " + positives)
    println("filter list method two returns " + positives2)
}

fun checkElementPresence(){

}


