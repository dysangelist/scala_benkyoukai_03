package study03.either

object EitherExample1 extends App {
  val b = Left("left")
  println(b)
  val c = Right("right")
  println(c)

}
