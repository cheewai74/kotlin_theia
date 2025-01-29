/***
 *  when (Switch Replacement)
 *  1. kotlinc when.kt -include-runtime -d when.jar
 *  2. kotlin when.jar
 */

 fun main(){

    val day = 3

    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Other day")
    }
 }