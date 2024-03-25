fun main() {
 calculate(number = arrayOf(20,10,30,40))
    volume(4,6,3.14159)
    isPalindrome("madam")
}
fun sentence(word:Array<String>){
    var bakes= arrayOf("Barnie bakes brown bagels and buns")
    var index = bakes.get indexOf:String
   ("bakes")
    println()
}
fun calculate(number:Array<Int>){
    var sum = number.sum()
    println(sum)
    var all=number.count()
    println(all)
    var overall =number.average()
    println(overall)
}

fun volume(number: Int,radius:Int,pi:Double){
    var formula= number/pi*radius*pi*pi*pi
    println(formula)

}
fun isPalindrome(word:String):Boolean{
    var check =isPalindrome("madam")
    if (word == check {println(true)
    }
    else{
        println(false)
    }



