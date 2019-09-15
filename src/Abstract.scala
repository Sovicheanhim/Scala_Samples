abstract class Vehicle(name: String){
  val category: String
  def car_type: Unit ={
    println(category)
  }
  override def toString = s"The vehicle type is $category"
}
class Car(name: String) extends Vehicle(name){
  val category = "car"
}
class Bike (name:String) extends Vehicle(name){
  val category = "bike"
}
class Bus (name:String) extends Vehicle(name){
  val category = "bus"
}
object Abstract extends App{
  val car = new Car("Honda")
  val bike = new Bike("Yamaha")
  val bus = new Bus("Tata")
  car.car_type
  bus.car_type
  bike.car_type
  println(car)
  println(bike)
  println(bus)
}


//In Abstract class, we can also give non-abstract method
//We can also use the final keyword to avoid for the function/ variable being overridden
//abstract class myauthor(name: String, topic:String){
//  def details(): Unit ={
//    println("Hello World")
//  }
//}
//class mywriter(name:String, topic:String) extends myauthor(name, topic){
//  override def details(): Unit ={
//    println("Author name: "+name)
//    println("Topic: Abstract: "+topic)
//  }
//}
//
//object Abstract{
//  def main(args: Array[String]): Unit = {
//    var obj = new mywriter("Sovichea", "Absract Class")
//    obj.details()
//  }
//}
