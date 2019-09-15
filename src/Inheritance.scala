trait A{
  var kiki = 9
  def sayHi(): Unit ={
    println("Hi World")
  }
}
trait B{
  def sayHello(): Unit ={
    println("Hello World")
  }
}
trait C{
  def sayHeh(): Unit ={
    println("Heh World")
  }
}
class GetAllTheFunction extends A with B with C{
  kiki = 10
  override def sayHello(): Unit = {
    println("Fuck Hello " + kiki)
  }
}
object Inheritance{
  def main(args: Array[String]): Unit = {
      val obj = new GetAllTheFunction();
      obj.sayHi()
      obj.sayHello()
      obj.sayHeh()
  }
}