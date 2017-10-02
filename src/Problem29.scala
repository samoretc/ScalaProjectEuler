import scala.collection.immutable.IndexedSeq

object Problem29 extends App {
  val answer = (for (a <- 2 to 100; b <- 2 to 100) yield scala.math.pow(a, b)).distinct.size
  println(s"answer is ${answer}")
}
