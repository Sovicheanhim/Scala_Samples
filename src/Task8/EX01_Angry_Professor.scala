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
      var cases = readLine().split(" ")
      while (cases.size < students) {
        println(s"Please type the input of $students student/students :")
        cases = readLine().split(" ")
      }
      if ((cases.map(_.toInt).filter(_>=0).size) < cancellationThreshold) println("YES") else println("NO")
    }
  }
}