object Problem34 extends App {

  def factorial(num: Int, tot: Int = 1): Int = {
    if (num < 2)
      return tot
    return factorial(num - 1, tot * num)
  }

  val digitFactorialValueMap: Map[Char, Int] = (0 to 9).toList.map(n => {
      n.toString.charAt(0) -> factorial(n)
    }).toMap

  def isEqualToFactorialDigitSum(num: Int): Boolean = {
    num.toString.map(c => digitFactorialValueMap.get(c).get).sum == num
  }

  val ans = (3 to 1000000).view
        .filter(isEqualToFactorialDigitSum)
        .sum

  println(s"Answer is ${ans}")
}
