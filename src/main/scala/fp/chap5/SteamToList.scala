package fp.chap5


/**
  * Created by cyril on 24.11.15.
  * Exercise 5.1
  */
object SteamToList {

  def toList[A](stream: Stream[A]): List[A] = {
    if (stream.isEmpty)
      List.empty
    else
      stream.head :: toList(stream.tail)
  }


  /**
    * Exercise 5.2
    * @param n
    * @param stream
    * @tparam A
    * @return
    */
  def take[A](n: Int, stream: Stream[A]): Stream[A] = {
    if (n <= 0 || stream.isEmpty) {
      Stream.empty
    } else {
      stream.head #:: take(n - 1, stream.tail)
    }
  }
}
