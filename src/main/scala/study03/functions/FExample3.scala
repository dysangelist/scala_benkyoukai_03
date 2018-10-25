package study03.functions

object FExample3 extends App {

  val f: Int => Unit = n => print(s"I am a function that prints $n~!")

  def sleepyFunctionRunner(func: Int => Unit, n: Int) = {
    Thread.sleep(1000)
    func(n)
  }

  sleepyFunctionRunner(f, 3)
}
