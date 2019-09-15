//Review the code,refer and explain the terms in this program
import java.io.IOException
import javax.sound.sampled.{LineUnavailableException, UnsupportedAudioFileException}
object Task5{

  case class Customer(age: Int)

  class Cigarettes

  case class UnderAgeException(message: String) extends Exception(message)

  def buyCigarettes(customer: Customer): Cigarettes =
    if (customer.age < 16)
      throw UnderAgeException(s"Customer must be older than 16 but was ${customer.age}")
    else new Cigarettes

  val youngCustomer = Customer(15)
  try {
    buyCigarettes(youngCustomer)
    "Yo, here are your cancer sticks! Happy smokin'!"
  } catch {
    case UnderAgeException(msg) => msg
  }
}