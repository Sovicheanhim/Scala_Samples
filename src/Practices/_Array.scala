package Practices
import Array._

object _Array {
  def main(args: Array[String]): Unit = {
    var arr = Array(1, 4, 5)
    var arr3 = Array(1, 2, 4, 5, 6)
    var arr1 = new Array[Any](5)
    var arr2 = concat(arr, arr3)
    for(i <- 0 to 4) {
      arr1(i) = i + 1
    }
    arr1.foreach(i => println(i))
    arr.foreach(i => println(i))
    arr2.foreach(i => println(i))
    println(2, 3)
  }
}
