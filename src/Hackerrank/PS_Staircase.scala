package Hackerrank

object PS_Staircase {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    for(i <- 1 to n){
      for(_ <- 0 until n-i) print(" ")
      for(_ <- 0 until i) print("#")
      println()
    }
  }
}
