
/***
 *  datatype_example.kt
 *  1. kotlinc Game.kt -include-runtime -d Game.jar
 *  2. kotlin Game.jar
 * 
 */

 
fun printSum(int1: Int, int2: Int){
    val result = int1 + int2
    println(result)
}

fun max(a: Int, b: Int): Int{
    val maxValue = if ( a > b) a else b
    return maxValue
}

fun maxValue(args: Array<Int>): Int {

    var max  = args[0]
    var x = 1
    while (x < args.size){
        var item = args[x]
        max = if ( max >= item ) max else item
        x = x + 1
    }
    return max
}

// fun getUserChoice(optionParams: Array<String>): String{
//     println("Please enter one of the following: Rock Paper Scissors")
// }

fun updateArray(optionsParam: Array<String>){
    optionsParam[2] ="Tom"
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String{
    var isValidChoice = false
    var userChoice = ""
    
    print("Please enter one of the following:")
    for(item in optionsParam) print(" $item")
    println(".")
    val userInput = readLine()
    if (userInput != null && userInput in optionsParam){
        isValidChoice = true
        userChoice = userInput
    }

    if(!isValidChoice) println("You must enter a valid choice.")

    return userChoice
    }

fun printResult(userChoice: String, gameChoice: String){
    val result = when{
        userChoice == gameChoice -> "Tie"
        userChoice == "Rock" && gameChoice == "Scissors" -> "You Win"
        userChoice == "Scissors" && gameChoice == "Paper" -> "You Win"
        userChoice == "Paper" && gameChoice == "Rock" ->  "You Win"
        else -> "You lose!"
    }
    
    return println("You choose $userChoice. I choose $gameChoice. $result")
}

fun main(){
    val options = arrayOf("Rock","Paper","Scissors")
    // updateArray(options)
    // println(options[2])

    // val x: Int = 7
    // val y: Int = 8
    // printSum(x,y)
    // println(max(x,y))

    // for ( x in 15 downTo 1) println(x)

    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}