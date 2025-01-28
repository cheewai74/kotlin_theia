/***
 * 1. kotlinc App.kt -include-runtime -d App.jar
 * 2. kotlin App.jar
 */

fun main(args: Array<String>){
    println ("Hello Kotlin in Theia IDE")

    val name = "Tom"
    val height = 1.9

    println("Hello")
    println("My name is $name")
    println("My height is $height m tall.")

    val a = 6
    val b = 7
    val c = a + b + 10
    val str = c.toString()

    println(str)

    val numList = arrayOf(1,2,3)
    var x = 0
    while (x < 3){
        x = x +1
        println("Item $x is ${numList[x-1]}")
    }


    var z = 0
    while(z < 8){

        z = z + 1
        println(z)
    }
}