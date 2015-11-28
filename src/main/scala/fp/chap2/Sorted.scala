package fp.chap2

import scala.annotation.tailrec

/**
  * Created by cyril on 21.11.15.
  * Exercise 2.2
  */
object Sorted {


  @tailrec
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (as.isEmpty || as.length == 1) {
      true
    } else if (!ordered(as.head, as.tail.head)) {
      false
    } else {
      isSorted(as.tail, ordered)
    }
  }
}
