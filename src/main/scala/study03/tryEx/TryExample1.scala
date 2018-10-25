package study03.tryEx

import scala.util.Try

object TryExample1 extends App {
  def tryANumber(n: Int): Try[Int] = Try {
    n
  }

  print(tryANumber(1))
}
