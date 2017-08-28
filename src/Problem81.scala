import scala.io.Source
import java.io.File


object Problem81 extends App {
  val matrix: List[Array[Int]] = readlines("matrix.txt").map(_.split(",").map(_.toInt))
  matrix(0)(0)  = 1000
  println("Wait")
  Math.min

  /** Reads all lines from the supplied source file, stripping line endings. */
  def readlines (file :String) :List[String] =
    Source.fromFile("data" + File.separator + file).getLines().map(_.stripLineEnd).toList
}
