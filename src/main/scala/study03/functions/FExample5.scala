package study03.functions

object FExample5 extends App {
  val isEven: Int => Boolean = n => (n % 2) == 0

  println(Some(3).map(isEven))
}
