package study03.future.await

import java.util.concurrent.TimeUnit

import scala.concurrent.duration.Duration

object Timer {
  def apply[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()
    val duration = Duration(t1 - t0, TimeUnit.NANOSECONDS)
    println(s"Elapsed time: ${duration.toMillis} ms")
    result
  }
}
