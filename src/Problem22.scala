import scala.io.Source

object Problem22 extends App {
  println(
    Source.fromFile("names.txt", "UTF8")
    .getLines.map(_.stripLineEnd.split("\t", -1)).toList
  )
//println("hello world")
}
