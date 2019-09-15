package Tasks

class Exercises{
  def calculateTheSum = (a:Double, b:Double) => (a*a)+(2*a*b)+(b*b)
  def calculateTheAveg = (a:Double, b:Double) => (a+b)/2
  def getTheRes(a:Double, b:Double, func:(Double, Double) => Double) = func(a, b)

}
object Task6 {

  def main(args: Array[String]): Unit = {
    val exercise = new Exercises
    println(exercise.getTheRes(10, 20, exercise.calculateTheSum))
    println(exercise.getTheRes(45.5, 35.7, exercise.calculateTheAveg))
  }
}
