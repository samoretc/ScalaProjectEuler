object Problem30 extends App {

  def digitsCanBeWrittenAsSumOfPower(num: Int): Boolean = {
    num.toString.map(digit => {
      scala.math.pow(digit.asDigit, 5)
    }).sum.toInt == num
  }

  val ans = (2 until 1000000)
              .filter(digitsCanBeWrittenAsSumOfPower).sum
  println(s"answer is ${ans}")
}
