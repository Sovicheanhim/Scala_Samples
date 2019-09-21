package Hackerrank
import scala.io.StdIn._

object PS_Plus_Minus {
  def main(args: Array[String]): Unit = {
    val arr = readLine().split(" ").map(_.trim.toInt)
    val new_arr = Array(arr.count(_>0)*1.0/arr.length, arr.count(_<0)*1.0/arr.length, arr.count(_==0)*1.0/arr.length)
    println(new_arr.mkString("\n"))
  }
}
