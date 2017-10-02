import scala.collection.Searching.search
object Problem23 extends App {
  val now = System.currentTimeMillis()
  def sumOfDivisors(num: Int): Int = {
    ( 1 to (num/2)).filter(num % _ == 0).sum
  }

  def isAbundant(i: Int): Boolean = {
    sumOfDivisors(i) > i
  }

  val abundantNumbers: List[Int] = (1 until 28123).filter(isAbundant).toList

  val abundantNumbersSet: Set[Int] = abundantNumbers.toSet

  def sumOfTwoAbundantNumbers(i: Int): Boolean ={
      abundantNumbers.foreach(
        abundantNumber => {
          if (abundantNumber > i) {
            return false
          }
          if (abundantNumbersSet.contains(i - abundantNumber)) {
            return true
          }
        }
    )
    throw new Exception("Shouldn't be reached")
  }

  val sum = (0 until 28123).filterNot(sumOfTwoAbundantNumbers).sum

  println(s"Time taken ${System.currentTimeMillis() - now}")
  println(s"Answer is is ${sum}")
}
