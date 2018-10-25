package study03.functions

//explicit
object FExample1 extends App {
  val addOne: Int => Int = n => n + 1

  print(addOne(1))
}
