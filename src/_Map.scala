import collection.mutable._

object _Map {
  def main(args: Array[String]): Unit = {
    var students = Map(
      "01" -> "Sovichea",
      "02" -> "Soknoy",
      "03" -> "Thanak",
      "04" -> "Chhuneng"
    )
    students.foreach(x => println(x._1 + "-->" + x._2))
    println(students.get("01"))
    println()
  }
}
