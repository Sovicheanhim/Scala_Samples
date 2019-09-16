package Task1

import scala.io.StdIn.readDouble

object EX01_BOOK {
  def main(args: Array[String]): Unit = {
    println("Enter the number of credit hours for this semester: ")
    val creditsHour = readDouble()
    println("Enter the amount of money spent on books :")
    val bookCost = readDouble()

    val totalCost = (creditsHour*85)+bookCost+65
    println(f"Your school fee is ${creditsHour*85}$$\nYour books' cost is $bookCost$$\nYour Athletic fee is 65$$\nYour total cost is $totalCost$$")
  }
}
