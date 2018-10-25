package study03.future.await

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}

object WithAwait extends App {
  def notSynchronized(a: Int) = Future {
    println(
      s"[Starting] not sync ${Thread.currentThread().getId} with value $a")
    Thread.sleep(1000)
    println(s"[Ending] not sync ${Thread.currentThread().getId} with value $a")
    a
  }

  def singleThreaded(a: Int): Int = this.synchronized {
    val ex: ExecutionContext = implicitly[ExecutionContext]
    println(s"[Starting] sync ${Thread.currentThread().getId} with value $a")
    val b = Await.result(notSynchronized(a), Duration.Inf)
    println(s"[Ending] sync ${Thread.currentThread().getId} with value $a")
    b
  }

  val c = Timer((1 to 3).map(a => singleThreaded(a)))

  println(c)
}
