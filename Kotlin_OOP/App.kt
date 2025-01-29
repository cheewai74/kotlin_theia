

class Car(val brand: String, val model: String){
    fun drive(){
        println("Drive $brand $model")
    }
}

fun main(){
    val myCar = Car("Toyota" , "Corolla")
    myCar.drive()
}