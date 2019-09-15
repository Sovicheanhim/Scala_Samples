//import scala.collection.immutable._
import scala.collection.mutable._
import Array._
import scala.collection.mutable
import scala.io.StdIn._

object Collections {
  def _List(): Unit ={
    //    list is a collection which contain immutable data. List represents linked list in Scala. The Scala List class holds a sequenced, linear list of items.
    //    Lists are immutable whereas arrays are mutable in Scala
    //    Lists represents a linked list whereas arrays are flat
    val list = List.fill(5)("Scala")
    val list1 = list.reverse
    println(list.isEmpty)
    println(list.head)    //return the head of the list
    println(list.tail)    //print a list of all element except the first
    println(list.last)    //return the last element of the list

    //    Since list is immutable, if you want create a list that is constantly changing, ListBuffer is preffered
    //    So once we're done updating the list, we can convert it to list by using .toList
    //    List += e is used for append
    //    e +=: List is used for prepend

    var name = ListBuffer[String]()
    name += "String"
    name += "Hello"
    name += "World"
    println(name.toList)   //Will print as list
    name += "Hello"
    println(name)   //will print as ListBuffer
    name.remove(0) //remove element with their index

    //    ListSet contains the unique item and immutable data. Elements are stored in a reverse way.
//    val listSet = ListSet("aaa", "bbb", "ccc")
//    println(listSet)
//    println(listSet("aaa"))
//    //      Initialize an empty listSet
//    val empytyListSet = ListSet.empty[String]
  }

  def _Set(): Unit ={

  }

  def _Array(): Unit ={
//    Array is a special kind of collection in scala. It is a fixed size data structure that stores elements of the same data type
//    var array = Array("List", 123, "Game", "FFF")
//    var array1 = new Array[String](5)
//    array1(1) = "Hello"
//    println(array (1))
//    var array2 = concat(array, array1)
//
//    var arrayBuff = ArrayBuffer[Any]("Hello", "World", 123)
//    Use the remove function to remove element based on their indexes
  }

  def _bitSet(): Unit ={
    var bitSet =  BitSet(0, 1, 2, 3)
    bitSet = bitSet ++ mutable.BitSet(5, 6, 9)
    bitSet.foreach{i => println(bitSet(i))}
    println(s"${bitSet(4)}")    //will print false
//    BitSet will print only true or flase. True happens when there're elements in the bitSet and false when there're no element in that bitSet
  }

  def _treeSet(): Unit ={
    val numbers = mutable.TreeSet(1, 2, 3, 4, 5, 6,7 ,8 , 9)
    println("Enter a number :")
    val in = readInt()
    println(s"The higher or similar to $in is ${numbers.minAfter(in)}")
  }
  def main(args: Array[String]): Unit = {
//    _Array()
//    val name = ("g4g", "tete")
//    name.productIterator.foreach{ i => println(i)}
//    _bitSet()
    _treeSet()
  }
}
