package study03.tryEx

import scala.util.Try

object TryExample2 extends App {
  def tryANumber(n: Int): Try[Int] = Try {
    throw new Exception("I don't want to give you a number!!")
    n
  }

  print(tryANumber(1))

}
