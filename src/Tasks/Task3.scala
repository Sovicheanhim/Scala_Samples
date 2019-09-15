package Tasks
import scala.collection.immutable.Map
import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer
object Task3 {
//  def countDuplicate(numbers: Array[Int]): Int = {
//    numbers.foldLeft(Map.empty[Int, Int]) {
//      (map, item) =>
//        map + (item -> (map.getOrElse(item, 0) + 1))
//    }.count(_._2 > 1)
//  }
  def exercise01(): Unit ={
      var numbers = new Array[Int](3)
      println("Enter three numbers : ")
      for (i <- 0 until 3)
        numbers(i) = readInt()
      for(i <- numbers){
        var temp = 0
        for (j <- numbers){
          if(i == j){
            temp += 1
          }
        }
        println(i + " occurs " + temp + " times")
      }
  }

  def exercise02(): Unit ={
    var new_array = Array(10, 20, 30)
    new_array = new_array++Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(i <- new_array) println(i)
  }

  def exercise03(): Unit ={
    var array = ArrayBuffer[Int]()
    var temp:Int = 0
    println("Enter the size of array :")
    val num = readInt()
    println("Input "+num+" elements in the array in ascending order:")
    for (i <- 0 until num){
        print("element - " + i +" :")
        temp = readInt()
        array += temp
    }
    println("Input the position where to delete : ")
    temp = readInt()
    array -= array(temp-1)
    print("The new list is : ")
    for(i <- array){
      print(i+" ")
    }
  }

  def exercise04(): Unit ={
    var temp = 0
    var max = 0
    var second_max = 0
    var array = ArrayBuffer[Int]()
    println("Input the size of array :")
    var num = readInt()
    println("Input " + num + " elements in the array :")
    for(i <- 0 until num){
      print("element - " + i +" :")
      temp = readInt()
      array += temp
    }
    for(i <- array){
      if (i > max){
        second_max = max
        max = i
      }
      else if(i > second_max && i != max)
        second_max = i
    }
    println("The Second largest element in the array is : "+second_max)
  }
  def main(args: Array[String]): Unit = {
//      exercise01()
//      exercise02()
//      exercise03()
        exercise04()
  }
}
