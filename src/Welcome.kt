import java.lang.Integer.parseInt
import java.lang.Integer.toString

/**
 * Copyright (c) 2020 Eniola Ipoola
 * All rights reserved
 * Created on 09-Jan-2020
 */
fun main(){
    println("Hello World");
    sum(4,5);
    sum2(5, 6);
    print(7,6);
    printSum(5, 9);
    scoreCheck();
    forDebugging();
    printProduct("5", "10");
}

fun sum(a: Int, b:Int): Int {
    return a + b ;
}

/*Function with an expression body and inferred return type*/
fun sum2(a: Int, b: Int) = a + b ;

/*Function returning no meaningful value*/
fun print(a:Int, b:Int): Unit {
    println("sum of $a and $b is $(a+b)")
    //("sum of 4 and 5 is $(9)")
}

fun printSum(a:Int, b:Int){
    println("")
}

/* Omit unit return type */
fun printUnit(a:Int, b:Int){
    println("sum of $a and $b is $(a+b)")
}

/* Variables in Kotlin*/
val a: Int = 1;
val b: String = "Hello World";
val c: Double = 6.8;


fun scoreCheck(){
    for(myScore in 43..48){
        println("score isn't bad")
    }
}

fun forDebugging(){
    for(i in 1..3){
        println(i);
    }
}


/* For in java*/
/*for(int i = 0; i < 10; i++){
    System.out.println(i);

    //0
    //1
    //



    2

}*/

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1);
    val y = parseInt(arg2);

    if(x != null && y != null){
        println ( x * y);
    }

    println(toString(10));
}


