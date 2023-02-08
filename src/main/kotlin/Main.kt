fun main() {

   salutation()

    var b = remainder(58,7)
    println(b)


    var c = sum(5,6,789,234)
    println(c)

    justme()
}

fun salutation (){
  var name =" Suzzie"
    println("Hello ${name}")

}


fun remainder(num1:Int,num2:Int,):Int{
    var remainder = num1 % num2
    return remainder
}
fun sum (num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum = num1+num2+num3+num4
    return sum

}

fun justme(){
    var justme = "Find me writing code"
    println(justme)

}