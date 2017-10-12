import scala.collection.immutable.HashSet

object Problem35 extends App {


  def isPrime(num: Int): Boolean = {
    if (num < 2) false else (2 to Math.sqrt(num).toInt + 1).view.collectFirst{case x if num % x == 0 => x}.isEmpty
  }

  val digitPrimes: HashSet[Char] = HashSet('1', '2', '3', '5', '7')

  def digitsAreAllPrime(num: Int): Boolean = {
    num.toString.collectFirst { case (c: Char) if !digitPrimes.contains(c) => c }.isEmpty
  }

  def rotateString(num: String): List[String] = {
    (for {i <- 0 until num.length } yield num.drop(i).concat(num.take(i))).toList
  }

  def rotationsAreAllPrime(num: String): Boolean = {
    rotateString(num).forall(primesToOneMillion.contains)
  }


  val primesToOneMillion = (3 until 1000000 by 2).view
                .filter(isPrime)
                .map(_.toString)
                .toSet
  
  println("Loaded all primes to one million")

  val ans = (3 until 1000000 by 2).view.map(_.toString).count(rotationsAreAllPrime) + 1 // adding one for the circular prime 2

  println(s"Answer is ${ans}")
}
