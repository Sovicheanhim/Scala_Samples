package Tasks

import scala.math.BigDecimal

object Task1{

  def exercise01(){
    println("Enter the number of item: ")
    var number:Int = scala.io.StdIn.readInt()
    var total:Float = 0
    for(i <- 1 to number){
      println("Enter item "+i+"'s weight: ")
      var weight:Float = scala.io.StdIn.readFloat()
      println("Enter item "+i+"'s number of purchases: ")
      var num_of_purchase:Float = scala.io.StdIn.readFloat()
      total += weight*num_of_purchase
    }
    total = total/number
    println("The average value of the items is " + BigDecimal(total).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble)
  }
  def exercise02(){
    println("Enter your ID:")
    var id: Int = scala.io.StdIn.readLine().toInt
    println("Enter your total worked hours:")
    var t_work: Double = scala.io.StdIn.readLine().toDouble
    println("Enter the amount you recevied per hour:")
    var amount: Double = scala.io.StdIn.readLine().toDouble
    var salary:Double = BigDecimal(amount*t_work).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    println("Your ID is "+id+"\nYour salary this month is "+salary)
  }
  def exercise03(){
    println("Enter three numbers :")
    val num1 = scala.io.StdIn.readInt()
    val num2 = scala.io.StdIn.readInt()
    val num3 = scala.io.StdIn.readInt()
    if(num1 > num2){
      if(num1 > num3)
        println("The maximum number is "+num1)
      else
        println("The maximum numebr is "+num3)
    }
    else{
      if(num2 > num3)
        println("The maximum number is "+num2)
      else
        println("The maximum numebr is "+num3)
    }
  }
  def exercise04(){
    println("Enter the days :")
    val days = scala.io.StdIn.readInt()
    println(days+" days equal to " + (days/365) + " years, " + ((days%365)/30) + " months, and " + ((days%365)%30) + " days")
  }
  def main(args: Array[String]): Unit = {
    exercise01()
    exercise02()
    exercise03()
    exercise04()
  }
}