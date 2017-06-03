// Maths Calculator *** Use DataType FLoat for it flexiabilty

fun main (args:Array<String>){

    println("**** Maths Calculator ****")
    println("Enter First Value")
    var num1 :Float = readLine()!!.toFloat()
    println("Enter Second Value")
    var num2 :Float = readLine()!!.toFloat()
    var result : Float?
    result = num1+num2
    println("Result : $result")

}