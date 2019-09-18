package Task7
import scala.io.StdIn._

object EX01_Kangaroo {
  def kangaroo():Unit = {
    println("Enter the first kangaroo's location and speed and the second's respectively : ")
    val kangaroo = readLine().split(" ").map(_.toInt)
    val (x1, v1, x2, v2) = (kangaroo(0), kangaroo(1), kangaroo(2), kangaroo(3))
    if (v1 > v2 && ((x2-x1)%(v1-v2) == 0)) println("YES") else println("NO")
  }
  def main(args: Array[String]): Unit = {
    kangaroo()
  }
}
