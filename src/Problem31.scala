// This is a more elegant solution I found online.
//object Problem31 extends App {
//  def perms (remain :Int, coins :List[Int]) :Int =
//    if (remain == 0) 1 else coins match {
//      case Nil => 0
//      case h::t =>
//        0 to (remain/h) map(q => perms(remain - q*h, t)) sum
//    }
//  println( perms(200, List(200, 100, 50, 20, 10, 5, 2, 1)) )
//}

object Problem31 extends App {
  var tot = 0
  var pennies, twos, nickles, dimes, twenties, fifties, hundreds = 0

  val total = 200

  while (pennies < (total / 1) + 1) {
    twos = 0
    while (twos < (total / 2) + 1 ) {
    nickles = 0
    while (nickles < (total / 5) + 1) {
      dimes = 0
      while (dimes < (total / 10) + 1) {
        twenties = 0
        while (twenties < (total / 20) + 1) {
          fifties = 0
          while (fifties < (total / 50) + 1) {
            hundreds = 0
            while (hundreds < (total / 100) + 1 ) {
              var sum = pennies + (5 * nickles) + (2 * twos) + (10 * dimes) + (twenties * 20) + (fifties * 50) + (hundreds * 100)
              if (sum == total) {
                tot += 1
                //            println(s" ${pennies} pennies + ${twos} twos +  ${nickles} nickles is ${total} ")
              }
              hundreds += 1
            }
            fifties += 1
          }
          twenties += 1
        }
        dimes += 1
      }
      nickles += 1
      }
      twos +=1
    }
    pennies += 1
  }

  println(s"total ${tot}")
}
