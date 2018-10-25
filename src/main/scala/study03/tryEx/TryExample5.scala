package study03.tryEx

object TryExample5 extends App {

  //type annotationの追加でexceptionが発生する可能性があることは分からない
  val a = {
    try {
      throw new Exception("I don't want to give you a number!!")
    } catch {
      case e: Exception => "Beep"
    }
  }

}
