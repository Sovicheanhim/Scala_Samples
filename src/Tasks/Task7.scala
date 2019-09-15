package Tasks
import scala.collection.mutable.ListBuffer
import scala.io.StdIn._
object Task7 {
  def exercise01(): String ={
    println("Enter the number: ")
    val temp = readInt()
    var sum = 0
    if(temp >= 9){
      for(i <- 1 to temp){
        sum += i*i*i
      }
      sum.toString
    }
    else
      "Enter the number bigger than 9"
  }

  def exercise02(): Double ={
    var list = ListBuffer[Double]()
    for(i <- 1 to 3){
      println(f"Enter the rating for App $i : ")
      list += readDouble()
    }
    list.max
  }

  def exercise03(): Unit ={
    val list = ListBuffer[Int]()
    for(i <- 1 to 10){
      println(f"Enter the value for number $i:")
      list += readInt()
    }
    println(f"The sum for odd numbers is ${list.filter(_ %2 != 0).sum}")
    println(f"The sum for even numbers is ${list.filter(_ %2 == 0).sum}")
  }

  def exercise04(): Double ={
    val list = ListBuffer[Double]()
    for (i <- 1 to 5){
      println(f"Enter the value for number $i:")
      list += readDouble()
    }
    list.filter(_ > 15).sum
  }

  def cube(i:Int): Int = i*i*i
  def sumTheCube(a:Int, b:Int):Int = {
    if(a>b) 0 else cube(a) + sumTheCube(a+1, b)
  }
  def main(args: Array[String]): Unit = {
//    println(f"The sum of cube value is ${exercise01()}")
//    println(f"The best app is ${exercise02()}")
//    exercise03()
//    println(exercise04())
    println(sumTheCube(5, 6))
  }
}
