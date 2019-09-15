package Tasks
import scala.collection.mutable.ListBuffer
import scala.io.StdIn._


object Task4 {
  def exercise01 (): Unit ={
    var sum = 0
//    Code for manual Input
//    var array = ListBuffer[Int]()
//    println("Enter the array for 10 elements: ")
//    for (i <- 1 to 10){
//      var temp:Int = readInt()
//      array += temp
//    }
//    Default Input
    val array:List[Int] = List(1,2,3,4,5,6,7,8,9,10)
    for (i <- array){
      if(i % 2 != 0)
        sum += i
    }
    println(s"The sum of odd elements is $sum")
  }

  def calculateDistance(x1:Int, y1:Int, x2:Int, y2:Int): Double ={
    scala.math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2))
  }

  def exercise02(): Unit ={
    val N = readInt()
    var sum = 0.0
    var x:Array[Int] = Array.fill[Int](N+1)(0)
    var y:Array[Int] = Array.fill[Int](N+1)(0)
    for (i <- 1 to N){
      val s = readLine().split(" ").map(_.toInt)
      x.update(i, s(0))
      y.update(i, s(1))
      if ( i > 1 )
        sum += calculateDistance(x(i), y(i), x(i-1), y(i-1))
    }
    sum += calculateDistance(x(1), y(1), x(N), y(N))
    println(sum)
  }
  def main(args: Array[String]): Unit = {
//    exercise01()
    exercise02()
  }
}
