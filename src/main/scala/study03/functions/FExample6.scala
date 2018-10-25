package study03.functions

object FExample6 extends App {
  println(Some(4).map { n =>
    n match {
      case number if (number % 2) == 0 => Some(n)
      case _                           => None
    }
  })
}
