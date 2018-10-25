package study03.either

//Bias
object EitherExample2 extends App {
  def mappingOverEither(either: Either[String, String]) = {
    either.map(str => println(str))
  }

  mappingOverEither(Left("left"))
  mappingOverEither(Right("right"))
}
