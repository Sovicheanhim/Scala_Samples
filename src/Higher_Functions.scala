object Higher_Functions {
//  def a1(a:Int, b:Int => Int) = b(a)
//  def multiply2 = (a:Int) => a*2
//  def main(args: Array[String]): Unit = {
//      print(a1(25, multiply2))
//  }

  def main(args: Array[String]): Unit = {
    val result = transform(2, r => 3.14 * r* r)
    print(result)
  }
  def transform(x:Int, f:Int => Double) = f(x)
}
