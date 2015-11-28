package fp.chap2

import java.lang.Math.abs

import scala.annotation.tailrec

/**
  * Created by cyril on 21.11.15.
  * Listing chap2
  */
object Factorial {


  def factorial(x: Int): Int = {
    @tailrec
    def go(x: Int, acc:Int): Int = {
      if(x == 0)
        acc * 1
      else
        go(x -1, acc * x)
    }
    go(x, 1)
  }

  private def formatResult[T](value: T, msg: String, f: T => T): String = {
    msg.format(value, f.apply(value))
  }

  private def formatAbs(x: Int) =  {
    formatResult(x, "The absolute value of %d is %d", abs)
  }

  private def formatFactorial(x: Int) = {
    formatResult(x, "The absolute value of %d is %d", factorial)
  }

  def main(args: Array[String]) {
    println(formatAbs(-42))
    println(formatFactorial(7))
  }

}
