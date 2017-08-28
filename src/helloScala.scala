object helloScala extends  App {
//  val lengths = Array(31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//
//  val ls = for (y <- 1900 to 2000; m <- 1 to 12) yield
//    if (m == 2)
//      if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) 29 else 28
//    else
//      lengths(m - 1)
//  val fs = ls.scanLeft(1)((ws, l) => (ws + l) % 7)
  val startTime = System.currentTimeMillis()

  val sol = factorial(100).toString().map(_.asDigit).sum



  println(sol)



  val timeLapsed = System.currentTimeMillis() - startTime

  println(s"Time lapsed is : $timeLapsed")


  def factorial(n: BigInt): BigInt = {
    if (n == 1)
      return 1
    else
      return n * factorial(n - 1)

  }
}


