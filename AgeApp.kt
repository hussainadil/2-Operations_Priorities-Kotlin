import java.util.*

// First Age App in Two Ways Staticaly and Dinamically

fun main (args: Array<String>){
   // This is Staticaly way Where any one can change current year


    println("1st Staticaly way ||  Enter Your Birth Year")
    var DOB : Int = readLine()!!.toInt()
    var age :Int?
    age = 2017-DOB
    println("Your Age IS : $age years")


    // This is Dinamicaly way where year taken direct from your pc calender

    println("2nd Dinamicaly way ||  Enter Your Birth Year")
    var DOB2 : Int = readLine()!!.toInt()
    var age2 :Int?
    var year : Int =Calendar.getInstance().get(Calendar.YEAR)
    age2 = year-DOB2
    println("Your Age IS : $age2 years")

}
