import java.io.File

import scala.io.Source

object Problem22 extends App {
    val lines: List[String] = Source.fromFile("data" + File.separator + "names.txt", "UTF8")
    .getLines
      .next.stripLineEnd
      .split(',').map(word => word.slice(1, word.length -1 ))
      .sorted
        .toList

  val answer =
    lines.zipWithIndex.map{
      case (name: String, rank: Int) => {
        name.map(_.toInt - 64).sum * (rank + 1)
      }
    }.sum

println(s"Answer ${answer}")
}
