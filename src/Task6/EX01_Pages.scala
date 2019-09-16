package Task6
import scala.io.StdIn._

object EX01_Pages {
  def main(args: Array[String]): Unit = {
    println("Enter the number of pages and the page you want to open respectively :")
    val (totalPages, page) = (readInt(), readInt())
    val pagesTurned = if (totalPages%2 == 0)
      if ((totalPages - page)/2.0 < Math.ceil((page - 1)/2.0).toInt ) Math.ceil((totalPages - page)/2.0).toInt else Math.ceil((page - 1)/2.0).toInt
    else
      if ((totalPages - page)/2.0 < Math.ceil((page - 1)/2.0).toInt ) Math.floor((totalPages - page)/2.0).toInt else Math.ceil((page - 1)/2.0).toInt
    println(s"The minimum pages needed is $pagesTurned")
  }
}