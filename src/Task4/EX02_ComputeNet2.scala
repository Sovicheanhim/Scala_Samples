package Task4
import scala.io.StdIn._

object EX02_ComputeNet2 {
  def main(args: Array[String]): Unit = {
    println("Enter your hourly pay rate and hours worked respectively: ")
    val (payRate, hoursWorked) = (readDouble(), readDouble())
    val grossPay = payRate*hoursWorked
    val withholdingTax = if (grossPay <= 300.0) 0.1*grossPay else 0.12*grossPay
    val netPay = grossPay - withholdingTax
    println(s"Your gross pay is $grossPay$$\nYour withholding tax is $withholdingTax$$\nYour net pay is $netPay$$")
  }
}
