package Practices
import java.lang._

object GFG {
  def sumOfSeries(num: Double): Double = {
    var res:Double = 0.00
    var fact = 1
    var i = 1
    while ( {
      i <= num
    }) {
      fact = fact * i
      res = res + (fact/i)

      {
        i += 1; i - 1
      }
    }
    res
  }

  def main(args: Array[String]): Unit = {
    val n:Double= 5.00
    System.out.println("Sum: " + sumOfSeries(n))
  }
}
