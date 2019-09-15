//class+constructor with parameter together
class Employee(empId: Int,name: String,salary :Double){
  //this is primary constructor
  println(empId,name,salary)
  //zero argument auxilary constructor
  def this()
  {
    //invokes argument in the constructor
    this(23,"name b",5000)
    println("auxiliary constructor")
  }
  //auxiliary constructor
  //e->empId,n->name in the constructor
  def this(e:Int,n:String){
    //invokes the particular argument(empId,Name)
    this(e,n,5000)
  }
}
//class Test(name: String, age:Int, school: String){
//  println(name, age, school)
//}
object Constructor {
  def main(args: Array[String]): Unit = {
    val a1 = new Employee(12, "name a", 4000)
    val a2 = new Employee()
    val a3 = new Employee(24, "name c")

//      new Test("Naruto", 16, "KIT")
  }
}
