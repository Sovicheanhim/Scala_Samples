package Task1

import scala.io.StdIn.{readDouble, readInt}

object EX02_Conversion {
  def main(args: Array[String]): Unit = {
    println("Enter your amount of Money in Dollars :")
    val money = readDouble()*4000
    println("Enter the type of denomination you want to convert :\n1 for 2000r\n2 for 1000r\n3 for 500r\n4 for 100r")
    val numberCode = readInt()
    numberCode match{
      case 1 => println(s"Here are ${money.toInt/2000} of 2000r for you")
      case 2 => println(s"Here are ${money.toInt/1000} of 1000r for you")
      case 3 => println(s"Here are ${money.toInt/500} of 500r for you")
      case 4 => println(s"Here are ${money.toInt/100} of 100r for you")
    }
  }
}