package Hackerrank

object PS_Diagnal_Difference {
  def main(args: Array[String]): Unit = {
    val arr = Array(Array(11, 2, 4), Array(4, 5, 6), Array(10, 8, -12))
    var (a, b) = (0, 0)
    println(arr.length)
    for(i <- arr.indices){
      a += arr(i)(i)
      b += arr(i)(arr.length - (i+1))
    }
    println(Math.abs(a-b))
  }
}
