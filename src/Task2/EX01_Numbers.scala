package Task2

object EX01_Numbers {
  def sum(num1:Int, num2:Int):Unit = println(s"The sum of $num1 and $num2 is ${num1+num2}")
  def difference(num1:Int, num2:Int):Unit = println(s"The difference of $num1 and $num2 is ${num1-num2}")
  def product(num1:Int, num2:Int):Int = num1*num2
  def main(args: Array[String]): Unit = {
    val (num1, num2) = (15, 32)
    sum(num1, num2)
    difference(num1, num2)
  }
}
