package Task8
import scala.io.StdIn._

object EX01_Angry_Professor {
  def main(args: Array[String]): Unit = {
    println("Enter the number of Test Cases :")
    val testCases = readInt()
    for(i <- 1 to testCases){
      println(s"Enter case number $i :")
      val test = readLine().split(" ").map(_.toInt)
      val (students, cancellationThreshold) = (test(0), test(1))
      val cases = readLine().split(" ").map(_.toInt).filter(_>=0)
      if (cases.size < cancellationThreshold) println("YES") else println("NO")
    }
  }
}
