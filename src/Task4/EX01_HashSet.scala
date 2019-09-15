package Task4
import scala.collection.mutable._
import scala.io.StdIn._
object EX01_HashSet {
  def main(args: Array[String]): Unit = {
    var list = HashSet.empty[String]
    println("Enter the number of inputs: ")
    val numberOfInput = readInt()
    for(i <- 0 to numberOfInput){
      list += readLine()
      println(list.size)
    }
  }
}
