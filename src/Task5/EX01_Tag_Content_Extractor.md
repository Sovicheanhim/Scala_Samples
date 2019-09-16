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

Algorithm of the task:
    +The Regex: "<(.+)>([^<]+)</\\1>"
        1. Group1: <(.+)>
            The regex starts matching with the opening tag format that starts and closes with the arrow brackets. 
            The "." matches any single character except the new line. It's tp ensure that there'll be no newline after the opening arrow bracket
            The "+" matches 1 or more of whatever it comes after.
            The parenthesis is for saving the content inside it to group 1
        2. Group2: ([^<]+)
            This will match anything inside the opening and closing tag
            The "[^<]" is to cut off any "<" that comes again after the first opening tag (in case of one tag inside another tag, so it will pick the inside tag).
            The "+" matches 1 or more of whatever it comes after.
            The parenthesis is for saving the content inside it to group 2