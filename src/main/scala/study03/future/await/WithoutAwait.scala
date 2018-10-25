package study03.future.await

import cats.implicits._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

//Without await
object WithoutAwait extends App {
  def notSynchronized(a: Int) = Future {
    println(
      s"[Starting] not sync ${Thread.currentThread().getId} with value $a")
    Thread.sleep(1000)
    println(s"[Ending] not sync ${Thread.currentThread().getId} with value $a")
    a
  }
  def singleThreaded(a: Int): Future[Int] =
    this
      .synchronized {
        println(
          s"[Starting] sync ${Thread.currentThread().getId} with value $a")
        notSynchronized(a)
      }
      .map { a =>
        println(s"[Ending]  sync ${Thread.currentThread().getId} with value $a")
        a
      }

    println(s"The main thread is ${Thread.currentThread().getId}")
    val c: List[Int] = Timer(Await.result(
      (1 to 3).map(a => singleThreaded(a)).toList.sequence,
      Duration.Inf))

    println(c)

}
