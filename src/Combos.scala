object Combos extends App {
  println("hello world")

  def nCombos(n: Int, k: Int): Int = {
    if (k == 1) return n
    else if (k == n) return 1
    else return nCombos(n - 1, k -1) + nCombos(n - 1, k)
  }

  def allCombos(s: String, k: Int, prefix: String = ""): List[String] = {
    if (k == 1) return s.map(c => prefix + c).toList
    else if (k == s.length) return List(s"${prefix}${s}")
    else return allCombos(s.substring(1), k -1, prefix + s.charAt(0).toString) ::: allCombos(s.substring(1), k, prefix)
  }

  def nPerms(n: Int, k: Int): Int = {
    if (n == k) return k
    return n * nPerms(n -1, k)
  }

  def allPerms(s: String, k: Int, prefix: String = ""): List[String] = {
    var x: List[String] = List()

    if (k == prefix.length) return List(prefix)
    for (i <- 0 until s.length) {
      x = x ::: allPerms(s.substring(0, i) + s.substring(i + 1, s.length), k, prefix + s.charAt(i).toString)
    }
    return x
  }

  println(nCombos(3, 2))
  println(nCombos(4, 2))
  println(nCombos(5, 3))

  println(allCombos("ABC", 2))
  println(allCombos("ABCDE", 2))
  println(allCombos("ABCD", 3))

  println(nPerms(3, 2))
  println(nPerms(5, 3))

  println(allPerms("abcd", 4))
}
