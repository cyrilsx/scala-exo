package fp.chap2

import scala.annotation.tailrec

/**
  * Created by cyril on 21.11.15.
  * Exercise 2.1
  *
  * @see fp.chap2.TestChap2
  */
object Fibonacci {

  def fibonacci(nb: Int): Int = {
    @tailrec
    def go(value: Int, subtract: Int, acc: Int): Int = {
      if (value == 0 || value == 1)
        1 + acc
      else
        go(value - subtract, subtract, acc + value)
    }
    go(nb, 1, 0) + go(nb, 2, 0)
  }

}
