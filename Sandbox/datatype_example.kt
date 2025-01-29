/***
 *  datatype_example.kt
 *  1. kotlinc datatype_example.kt -include-runtime -d datatype_example.jar
 *  2. kotlin datatype_example.jar
 * 
 * Type     Bits        Value range
 * Byte     8 bits      -128 to 127
 * Short    16 bits     32768 to 32767
 * Int      32 bits     -2147483648 to 2147483647
 * Long     64 bits     -huge to (huge - 1)
 * 
 * Note (For Kotlin):
 * 1. numbers are objects and the variable holds a reference to the object, not the object itself.file
 * 2. Chars in kotlin are characters, not numbers
 * 3. Every numeric type has the following conversion functions: toByte(), toShort(), toInt(), toLong(), toFloat() and toDouble().
 * 
 */

 fun main(){

    var x: Int = 65
    var isPunk = true
    var message = "Hello"
    var y = 7
    var z: Int = y
    y = y + 50

    var s: Short
  
    isPunk = false
    var k = y.toDouble()

    s = 0b1001

    var myArray = arrayOf(1,2,3)
    println(myArray[0])
    println(myArray.size)
 }
