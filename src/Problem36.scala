object Problem36 extends App {
  def base2(num: String): String = {
    var digit: Int = 0
    var numLeft = num.toInt
    var sol = ""

    while (!numLeft.equals(0)) {
      digit = Math.floor(logBaseN(numLeft, 2)).toInt
      numLeft = numLeft - Math.pow(2, digit).toInt
      if (sol.isEmpty) {
        sol = 1 + ("0" * digit)
      } else {
        sol = sol.substring(0, sol.length - digit - 1) + 1 + sol.substring(sol.length - digit, sol.length)
      }
    }
    sol
  }

  def logBaseN(num: Int, base: Int): Double = {
    Math.log(num) / Math.log(base)
  }

  def isPalindrome(num: String): Boolean = num.reverse == num

  val ans = (1 to 1000000).view.filter(num => isPalindrome(num.toString) && isPalindrome(base2(num.toString))).sum

  println(s"Answer is ${ans}")
}
