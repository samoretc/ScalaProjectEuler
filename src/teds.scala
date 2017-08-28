object teds extends App {
  def perms (remain :Int, coins :List[Int]) :Int =
    if (remain == 0) 1 else coins match {
      case Nil => 0
      case h::t =>
      0 to (remain/h) map(q => perms(remain - q*h, t)) sum
    }
  println( perms(200, List(200, 100, 50, 20, 10, 5, 2, 1)) )

//  List(1,2, 3, 4) match {
//    case x :: xs => println(x + " " + xs)
//    case _ => println("")
//  }
}