import java.util.Date

object Tuple {
  val mt=(67,9.00f,"name a",true)
  val mt1= new Tuple6(67,9.00,"name a",true,(2,"hi"),new Date())
  val list = List[Any](1, "hello", 4.4,(6,7),new Date())
  println(list)
  def main(args: Array[String]) {
    println(mt._4)
    println(mt._3)
    println(mt._2)
    println(mt1._5)

    mt1.productIterator.foreach{
      i=>println(i)
    }

    println(1->"name a"->true)
    val tup = (1, "hello":Any, 4.4)
    tup.productIterator.foreach{
      i=>println(i)
    }
  }
}