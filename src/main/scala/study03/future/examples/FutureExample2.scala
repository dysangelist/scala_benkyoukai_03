package study03.future.examples

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FutureExample2 extends App {
  val a = Future {
    Thread.sleep(1000)
    "I am in the future!"
  }
  print(a)
}
