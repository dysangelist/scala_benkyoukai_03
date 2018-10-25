package study03.future.examples

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureExample3 extends App {

  val a: Future[String] = Future("I am in the future!")
  print(a.map(a => s"a*~* $a *~*"))

}
