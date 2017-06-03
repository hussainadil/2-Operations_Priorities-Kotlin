/* Priorites Demo
Operation Rules
    1-  ()
    2-  ++ || -- (Before Variable)
    3-  ^
    5-  * || /
    5-  + || -
    6-  =
    7-  ++ || -- (After Variable) */
//-----------------------------------//

fun main (args:Array<String>){

    var n1=10
    var n2=10
    var n3=5
    var sum : Int?
    sum= ++n1+n2*n3-7
    print(sum)


}