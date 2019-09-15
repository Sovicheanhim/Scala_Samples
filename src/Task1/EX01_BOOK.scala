package Task1

import scala.io.StdIn.readDouble

object EX01_BOOK {
  val dlSign = "$"
  def main(args: Array[String]): Unit = {
    println("Enter the number of credit hours for this semester: ")
    val creditsHour = readDouble()
    println("Enter the amount of money spent on books :")
    val bookCost = readDouble()

    val totalCost = (creditsHour*85)+bookCost+65
    println(f"Your school fee is ${creditsHour*85}$dlSign\nYour books' cost is $bookCost$dlSign\nYour Athletic fee is 65$dlSign\nYour total cost is $totalCost$dlSign")
  }
}
