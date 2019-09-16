package Task7
import scala.io.StdIn._
import util.control.Breaks._

object EX01_Kangaroo {
  def kangaroo():Unit = {
    println("Enter the first kangaroo's location and speed and the second's respectively : ")
    val kangaroo = readLine().split(" ").map(_.toInt)
    if (kangaroo(1) > kangaroo (3) && ((kangaroo(2)-kangaroo(0))%(kangaroo(1)-kangaroo(3)) == 0)) println("YES") else println("NO")
  }
  def main(args: Array[String]): Unit = {
    kangaroo()
  }
}
