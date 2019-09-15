class Shapes{
  val description:String = "Shape"
  def display(): Unit ={
      println(description)
  }
}
class Shape_1 extends Shapes{
  override val description = "It's a circle"
  override def display(): Unit ={
    println(description)
  }
}
object Polymorphism {
  def main(args: Array[String]): Unit = {
    val obj = new Shape_1()
    obj.display()
  }
}
