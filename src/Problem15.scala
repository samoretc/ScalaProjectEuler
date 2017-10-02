object Problem15 extends App {
  val size = 21
  val arr = Array.ofDim[Long](size, size)
  def printArr = for(r <- 0 until size; c <- 0 until size) { if (c == 0) println(""); print(arr(r)(c) + "   ");} // helper method for debugging


  for (a <- 0 until size) {
    arr(a)(size - 1) = 1
    arr(size - 1)(a) = 1
  }

  for (a <- (0 to size - 2).reverse) {
    arr(a)(a) = arr(a + 1)(a) + arr(a)(a +  1)

    for (b <-(0 to a).reverse) {
      arr(b)(a) = arr(b + 1)(a) + arr(b)(a + 1)
      arr(a)(b) = arr(a + 1)(b) + arr(a)(b + 1)
    }
  }
  printArr
  println(arr(0)(0))
}
