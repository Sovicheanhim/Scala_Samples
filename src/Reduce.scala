import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object Reduce {
  val lst=List(90,1,0,4,6,1000,7)
  val lst2=List("name A","name B","name C")
  def main(args:Array[String]){
//    println(lst.reduceLeft(_+_))
//    println(lst2.reduceLeft(_+_))
//    println(lst.reduceLeft((x,y)=>{println(x +","+y);x+y}))
//    println(lst2.reduceRight(_+_))
//    println(lst.reduceRight((x,y)=>{println(x +","+y);x-y}))
//    println(lst.foldLeft(12)(_+_))
//    println(lst2.foldLeft("name z")(_+_))
//    println(lst.foldRight(12)(_+_))
//    println(lst2.foldRight("name z")(_+_))
//    var i=4
//    println(lst.scanLeft(i*i)(_+_))
//    println(lst2.scanLeft("name z")(_+_))
//    println(lst.scanRight(i*i)(_+_))
//    println(lst2.scanRight("name z")(_+_))
//        val id_nums = ListBuffer[String]()
//        val under = " "
//        var temp = ""
//        for(i <- 0 until 5){
//          println("Enter an id: ")
//          temp = readLine()
//          id_nums += temp
//        }
//        println(id_nums.foldLeft("")((a, b) => {a+"11018010"+b+"\n"}))

    // source collection
    val collection = List(1, 5, 7, 8)

    // converting every element to a pair of the form (x,1)
    // 1 is initial frequency of all elements
    val new_collection = collection.map(x => (x,1))

    /*
    List((1, 1), (5, 1), (7, 1), (8, 1))
    */

    // adding elements at corresponding positions
    val res = new_collection.reduce( (a,b) => ( a._1 + b._1,
      a._2 + b._2 ) )
    /*
    (21, 4)
    */

    println(res)
    println("Average="+ res._1/res._2.toFloat)
}
}
