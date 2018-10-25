package study03.functions

object FExample4 extends App {
  println(Some(3).map(n => (n % 2) == 0))
}
