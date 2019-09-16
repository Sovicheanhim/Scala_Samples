package Task7
import scala.io.StdIn._
import util.control.Breaks._

object EX01_Kangaroo {
  def kangaroo():Unit = {
    println("Enter the first kangaroo's location and speed and the second's respectively : ")
    val kangaroo = readLine().split(" ").map(_.toInt)
    if (kangaroo(1) > kangaroo(3) && ((kangaroo(2)-kangaroo(0))%(kangaroo(1)-kangaroo(3)) == 0)) println("YES") else println("NO")
  }
  def main(args: Array[String]): Unit = {
    kangaroo()
  }
}


Algorithm for this Task7:
    1. Both Kangaroo hops at the same jumps
    2. First Kangaroo's speed has to be faster than the second's speed or else it will never catch up
    3. If the difference in distance of both Kangs can achieved by the difference in speed of both Kangs multiplied by nth times,
        then both will match up in the nth jump
    4. This algorithm is to cut off the execution time by not looping both Kangs' jumps till they meet up (in most cases, the loop can go till 10^9 times)