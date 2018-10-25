package study03.future.examples

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureExample1 extends App {
  val a: Future[String] = Future("I am in the future!")
  print(a)
}
