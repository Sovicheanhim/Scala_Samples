package Task7
import scala.io.StdIn._
import util.control.Breaks._

object EX01_Kangaroo {
  def kangaroo():Unit = {
    println("Enter the first kangaroo's location and speed and the second's respectively : ")
    val input = readLine().split(" ")
    val kangaroo = input.map(_.toInt)
    var jump = 0
    breakable{
      while(true){
        kangaroo(0) += kangaroo(1)
        kangaroo(2) += kangaroo(3)
        jump += 1
        if(kangaroo(0) == kangaroo(2)){
          println(jump)
          println("YES")
          break
        }
        else if(jump < 0) {
          println("NO")
          break
        }
      }
    }
  }
  def main(args: Array[String]): Unit = {
    kangaroo()
  }
}
