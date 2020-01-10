import java.lang.Integer.parseInt
import java.lang.Integer.toString

/**
 * Copyright (c) 2020 Eniola Ipoola
 * All rights reserved
 * Created on 09-Jan-2020
 */
fun main(){
    println("Hello World");
    sum(4,5)
    sum2(5, 6)
    print(7,6)
    printSum(5, 9)
    createVariable()
    scoreCheck()
    forDebugging()
    printProduct("5", "10")
    incrementX()
    toplevel()
    printUnit(45, 2)
    println(maxOf(3,5))
    println(maxOfTwoNumbers(7, 3))
    println("object length is " +typeCasts(45))
    println("object length is " +typeCasts("hello"))
    loopInKotlin()
    ranges()
    iterating()
    lambdaExpression()
    //describe()

    var user = User()
    println(user.age)
    println(user.sex)
    println(user.username)
}

fun sum(a: Int, b:Int): Int {
    return a + b
}

/*Function with an expression body and inferred return type*/
fun sum2(a: Int, b: Int) = a + b

/* Function returning no meaningful value*/
fun print(a:Int, b:Int): Unit {
    println("sum of $a and $b is $(a+b)")
}

fun printSum(a:Int, b:Int){
    println("")
}

/* Omit unit return type */
fun printUnit(a:Int, b:Int){
    println("sum of $a and $b is $(a+b)")
}

/* Variables in Kotlin*/
val a: Int = 1
val b: String = "Hello World"
val c: Double = 6.8

fun createVariable(){
    println(" b and c are " + b + " and " + c + "respectively")
}


fun scoreCheck(){
    for(myScore in 43..48){
        println("score isn't bad")
    }
}

fun forDebugging(){
    for(i in 1..3){
        println(i)
    }
}

/** Nullable values and null checks
 * Local variables are assigned with the val keyword. They can be assigned a value only at once
 *  Variables that can be reassigned use the var keyword
 *  Using val instead of var for z in the code snippet below gives an error
 */
fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    var z = parseInt(arg2) + 10
    println("z before reassignment is " + z)


    if(x != null && y != null){
        println ( x * y)
        z = 45
        println(z)
    } else {
        println()
    }

    //or
    if(x == null){
        println("wrong number format in arg1: '$arg1'")
        return
    }

    if(y == null){
        println("wrong number format in arg2: '$arg2'")
    }

    println("Let's see what z is after reassignment " + z)

    println(toString(10))
}

/** Top level variables*/
var x = 0
fun incrementX(){
    x += 1
}

var intVariable = 1
fun toplevel(){
    val s1 = "a s $a"
    intVariable = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s1)
    println(s2)
}
/** Conditional Expressions*/
fun maxOf(args1: Int, args2:Int) : Int {
    if(args1 > args2){
        return args1
    } else {
        return args2
    }
}

/** Conditional Statement as an expression */
fun maxOfTwoNumbers(a: Int, b: Int) = if(a > b) a else b

/** Type checks and automatic cast */
fun typeCasts(obj: Any) : Int? {
    if(obj is String){
        return obj.length
    }
    return null
}


/** For Loop  && While Loops */
fun loopInKotlin(){
    val items = listOf("apple", "banana", "mango")
    for(item in items){
        println(item)
    }

    //checking if a collection contains an object using in operator
    when{
        "apple" in items -> println("juicy nice")
    }

    for(index in items.indices){
        println(index)
    }

    var index = 0
    while (index < items.size){
        println("items at $index is ${items[index]}")
        index++
    }
}


/** When expression */
fun describe(obj:Any) : String =
    when(obj){
        1 -> "one"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun ranges(){
    val x = 9
    val y = 10
    if(x in 1..y+1){
        println("x in in range")
    }
}

/** Iterating over a range */
fun iterating(){
    for (x in 1..5){
        println(x)
    }
}

/** Lambda expressions*/
fun lambdaExpression(){
    val fruits = listOf("banana", "pawpaw", "mango", "water-melon", "avocado", "apple")
    fruits.filter { it.startsWith("a")}
        .sortedBy { it }
        .map {it.toUpperCase()}
        .forEach{ println(it)}

}



