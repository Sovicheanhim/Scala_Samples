package Tasks

object Task2{
  // def transform(a:Int, b:Int, c:Int => Double) = c(a,b)
  def main(args: Array[String]): Unit = {
    val s = (u:Double, t: Double, a:Double) => (u*t) + (1/2.0*a*t*t)
    val area_trapezoid = (b1: Double, b2:Double, h:Double) => (b1+b2)*(h/2.0)
    val volume_sphere = (x:Double) => (4/3.0)*(3.14)*(x*x*x)
    val volume_cylinder = (x:Double, y:Double) => (3.14)*(x*x)*y
    println(s(1,2,3))
    println(area_trapezoid(2,3,6))
    println(volume_sphere(3))
    println(volume_cylinder(3,4))
  }
}
