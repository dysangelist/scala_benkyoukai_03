package study03.either

//projection
object EitherExample3 extends App {
  def projection(either: Either[String, String]) = {
    either.left.map(str => println(str))
  }

  projection(Left("left"))
  projection(Right("right"))

}
