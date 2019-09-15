package Task3
import scala.io.StdIn._

object EX01_Swimming {
  def main(args: Array[String]): Unit = {
    println("Enter the length, width and the depth of the pool :")
    val (length, width, depth) = (readDouble(), readDouble(), readDouble())
//    Gallons per cubic foot is 7.5 so the pool's Gallon is volume*gallons per cubic foot
//    Then the flow rate is 50 gallons per minute so in 1 hour the flow rate is 3000 gallons
//    So the time spent for filling the pool is the pool's gallon divided by the flow rate per hour
//    The filling price equals the time taken for filling in hours multiplied by 8$
//    The total price is the price for filling and the price for cleaning which is 75$ by default
    val totalPrice = ((((length*width*depth) * 7.5) / 3000) * 8) + 75
    println("The total price for filling and cleaning the pool is " + totalPrice +"$")
  }
}
