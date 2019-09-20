package Task9
import scala.collection
import scala.collection.mutable
import scala.io.StdIn._
import scala.collection.mutable._


object EX01_Electronics_Shop {
  def main(args: Array[String]): Unit = {
    println("Enter the amount of money, number of keyboard brands and number of USB drive brands respectively :")
    val input = readLine().split(" ").map(_.toInt)
    var (money, keyboard, usbDriver, max) = (input(0), input(1), input(2), -1)
    val n = checkCase(keyboard)
    val m = checkCase(usbDriver)
//    println(n.mkString(" "), m.mkString(" "))
    n.foreach{ i=>{ m.foreach{ j=>{if(i+j>=max&&i+j<=money) max = i+j} } } }
    println(max)
  }
  def checkCase(count:Int):Array[Int] = {
    var n = readLine().split(" ").map(_.toInt)
    if(!(n.size==count)){
      println(s"Please enter the input of $count integers again")
      n = readLine().split(" ").map(_.toInt)
    }
    n
  }
}
