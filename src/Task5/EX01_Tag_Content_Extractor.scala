package Task5
import scala.util.matching.Regex
import scala.io.StdIn._

object EX01_Tag_Content_Extractor {
  def main(args: Array[String]): Unit = {
    println("Enter the number of lines :")
    var testCases = readInt()
    while(testCases > 0){
      var line = readLine();
      var matchFound = false
      val pattern = "<(.+)>([^<]+)</\\1>".r
      pattern.findAllIn(line).matchData foreach{
        m => println(m.group(2))
          matchFound = true
      }
      if(!matchFound) println("None")
      testCases -= 1
    }

  }
}
