package study03.tryEx

import scala.util.Try

object TryExample4 extends App {
  def tryANumber(n: Int): Try[Int] = Try {
    throw new Exception("I don't want to give you a number!!")
    n
  }

  tryANumber(1).transform(s => Try(print(s"*~*s*~*")), e => Try(println("error :(")))

  tryANumber(3).failed.map(_ => println("error :("))
}
