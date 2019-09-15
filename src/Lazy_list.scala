import java.util.stream.Collectors._
import scala.collection.immutable.Stream._
object Lazy_list{
  def main(args:Array[String]){
    val stream1: Stream[Int] = 1 #:: 2 #:: 3 #:: Stream.empty
    val stream3: Stream[Int] = Stream.from(10)
    println(s"Elements of stream1 = $stream1")
    print(s"Take first 3 numbers from stream2 = $stream1")
    stream1.take(0).print
    print(s"\nTake first 10 numbers from stream2 = $stream1")
    stream1.take(10).print
    print("\n"+stream1)
    print("\nTake only the first 20 numbers from the infinite number stream = ")
    println(s"Elements of stream3 = $stream3")
    stream3.take(250).print
  }
}