package study03.either

import scala.util.Try

object EitherExample4 extends App {
  val a = Try { 1 }
  val aOption = a.toOption
  val aEither = a.toEither
}
