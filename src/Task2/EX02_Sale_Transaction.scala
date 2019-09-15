package Task2
import scala.io.StdIn._

object EX02_Sale_Transaction {
  def calculateFinalPrice(price:Double, commissionRate:Double, discountRate:Double): Double ={
    val commissionAmount = price+(commissionRate*price/100)
    commissionAmount-(discountRate*commissionAmount/100)
  }
  def main(args: Array[String]): Unit = {
    println("Enter the price of the item :")
    val price = readDouble()
    println("Enter the salesperson's commission rate :")
    val commissionRate = readDouble()
    println("Enter the customer discount rate :")
    val discountRate = readDouble()
    println(s"The final price for the item is ${calculateFinalPrice(price, commissionRate, discountRate)}")
  }
}
