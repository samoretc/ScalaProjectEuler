import scala.collection.immutable.IndexedSeq

object Problem27 extends App {
  val timeStart = System.currentTimeMillis()

  def isPrime(num: Int): Boolean = {
    if (num < 2) false else (2 to (num / 2)).view.collectFirst{case x if num % x == 0 => x}.isEmpty
  }

  def myFunc(n: Int, a: Int, b: Int): Int = n*n + a*n + b

  def numOfConsecutivePrimes(a: Int, b: Int): Int = {
    Iterator.from(0).takeWhile(n => isPrime(myFunc(n, a, b))).size
  }

  val x: IndexedSeq[(Int, Int, Int)] =
    for {
      a <- -999 to 999
      b <- -999 to 999
      consecutivePrimes = numOfConsecutivePrimes(a, b)
    }
    yield (consecutivePrimes, a, b)

  val ans = x.sortBy(_._1).last
  println(s"Time taken was ${(System.currentTimeMillis() - timeStart)/ 1000} seconds ")
  println(s"There are ${ans._1} consecutive primes for a = ${ans._2} and b = ${ans._3}")
  println(s"The product of a and b is ${ans._2 * ans._3}")
}
