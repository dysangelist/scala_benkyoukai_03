package study03.tryEx

import scala.util.{Failure, Success, Try}

object TryExample3 extends App {
  def tryANumber(n: Int): Try[Int] = Try {
    throw new Exception("I don't want to give you a number!!")
    n
  }

  tryANumber(1) match {
    case Success(n) => print(n)
    case Failure(e) => print(e)
  }
}
