fun main() {
//println(words("Maureen","Akinyi"))
    var ages =arrayOf(45.0,6.0,89.0,67.0)
    var statistic = intergers(ages).contentToString()
    println(statistic)
    var numbers = Calculator(23,45,67,89)
    println(numbers.add(56))
    println(numbers.subtarction(22))
    println(numbers.multiple(45))
}
//fun words(nameone: String,nametwo: String): {
  //  return first
//}


fun intergers(age:Array<Double>):Array<Double> {
    var min = age.min()
    var max = age.max()
    var average = age.average()
    var site = arrayOf(min,max,average)
    return site
}


fun split(name:String){


}



class Calculator(var addition: Int,var subtraction: Int, var division: Int, var multiplication: Int ){
    fun add( addition: Int) :Int{
        var added = addition + addition
        return added
    }
    fun subtarction( subtract: Int): Int{
        var subtraction = subtraction - subtract
        return subtraction
    }
    fun multiple(multip:Int) :Int{
        var mult = multiplication *multip
        return mult
    } fun divide(division: Int) :Int{
        var div = division / division
        return div
    }
}