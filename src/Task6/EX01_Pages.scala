package Task6
import scala.io.StdIn._

object EX01_Pages {
  def main(args: Array[String]): Unit = {
    println("Enter the number of pages and the page you want to open respectively :")
    val (totalPages, page) = (readInt(), readInt())
    val pagesTurned = Math.min((totalPages/2)-(page/2), (page/2))
    println(s"The minimum pages needed is $pagesTurned")
  }
}