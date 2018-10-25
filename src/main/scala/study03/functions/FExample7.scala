package study03.functions

object FExample7 extends App {
  val nIfNIsEven: Int => Option[Int] = n =>
    n match {
      case number if (number % 2) == 0 => Some(n)
      case _                           => None
  }

  println(Some(4).map(nIfNIsEven))

}
