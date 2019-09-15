//Currying Function is a function that takes multiple arguments \
// into a function that takes single argument.

object Currying_Functions {
  def add(x:Int, y:Int): Int = x+y

  //A function that takes one (single) argument
  def add2(x:Int) = (y:Int) => x+y

  //Currying Function using Partial Application
  def add3(x:Int) = (y:Int) => x+y

  //another way to write currying function
  def add4(x:Int)(y:Int) = x+y

  //another way to write currying function using partial application
  def add5(x:Int)(y:Int) = x+y
  def main(args: Array[String]): Unit = {
    println(add(15, 9))

    println(add2(15)(9))

    //partially applied function
    val sum = add3(15)
    println(sum(9))

    println(add4(15)(9))

    val sum1 = add5(15)_
    println(sum1(9))
  }
}


