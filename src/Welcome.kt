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

    val user = Author()
    println(user.age)
    println(user.sex)
    println(user.username)

    rainbowColor()
    fishBreed()

    val fishFeedTreatResult = checkNullability()
    println("FishFoodTreat is not zero when decremented, its value is " + fishFeedTreatResult)

    stringInKotlin()
    booleanInKotlin()
    loopsInKotlin()
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


fun checkNullability(): Int{
    val fishFeedsTreat = 5
    println("decrementing fishFeedTreat gives " + fishFeedsTreat.dec())
    println("Thought this will print a boolean " + fishFeedsTreat?: 0)
    //brought this warning cause the variable can never be null since it was initialized
    return fishFeedsTreat?.dec() ?: 0
}

fun fishBreed(){
    val parentFish: Int = 2
    val firstBreed = 71
    val secondBreed = 233
    val killedFish: Int = 13

    if(secondBreed > firstBreed)
        println("Second breed of fish is greater than first breed")
    else
        println("That's unusual, first breed is greater")

    val operator = parentFish + firstBreed + secondBreed - killedFish
    val numOfAcquariomLeft = operator /  30
    println("Number of fishes left is " + operator)
    println("number of acquarium required are " + numOfAcquariomLeft)

    //all these lines of code done in a shorter way
    val fishResult = parentFish.plus(firstBreed).plus(secondBreed).minus(killedFish).div(30)
    println(fishResult)
}

fun rainbowColor(){
    //done intentionally
    var orangeBlack = "black color"
    //update variable value
    orangeBlack = "This colour is orange black (whatever that means)"
    println(orangeBlack)

    //set variable to null
    var black: String? = null
    black = null
    println(black)

    val greenColor = "green"
    //greenColor = "this sl"
    println(greenColor)

    //list that is null
    val myList: List<String?> = listOf(null, null)
    val newList: List<String> ? = null

    val checkListnullability: List<String?> ? =
        listOf(null, null)

    println("Null Lists are " + myList)
    println("Null Lists are in a different way noe " + checkListnullability)
    println("Null Lists are " + newList)

    val nullTest: Int? = null
    nullTest?.inc() ?: 0

    println("null test is " + nullTest)
}

fun stringInKotlin(){
    println("Hello " + "Eniola")

    val age = 25
    val sex = "female"
    println("Eniola is a $sex and she is $age years old")
}

fun booleanInKotlin(){
    println( "fish" == "plant")
    println( "fish" == "fish")

    val welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")
        else -> println("Too long!")
    }
}

//loops
fun loopsInKotlin(){
    val fish = 12
    val food = 5
    val swarm = listOf(fish, food)
    println(swarm)

    val school = arrayOf("OAU", "OOU", "UI", "Uni Ilorin")
    val numbers = intArrayOf(1,2,3)
    val mix = arrayOf("Eniola", 25)
    //nest arrays
    val bigswarm = arrayOf(swarm, arrayOf("dolphine, eagle"))

}


