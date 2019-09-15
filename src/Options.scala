import scala.io.Source
import java.net.URL
//object Options {
//  def main(args: Array[String]): Unit = {
//    val capitals  = Map("France" -> "Paris", "Japan" -> "Tokyo")
//
//    println("capitals.get(\"France\"): " + show(capitals.get("France")))
//    println("capitals.get(\"India\"): " + show(capitals.get("India")))
//
//    val a:Option[Int] = Some(5)
//    val b:Option[Int] = Some(10)
//    println("a.getOrElse(0):  "+ a.getOrElse(0))
//    println("b.getOrElse(0):  "+ b.getOrElse())
//
//    println("a.isEmpty():  "+ a.isEmpty)
//    println("b.isEmpty():  "+ b.isEmpty)
//
//  }
//  def show(x:Option[String]) = x match{
//    case Some(s) => s
//    case None => "?"
//  }
//}


object Options extends App{
  def getContent(url: URL):Either[String, Source] =
    if(url.getHost.contains("google"))
      Left("Requested URL is blocked for the good of the people.")
    else
      Right(Source.fromURL(url))

    getContent(new URL("https://youtube.com"))match{
      case Left(msg) => println(msg)
      case Right(source) => source.getLines.foreach(println)
    }

}