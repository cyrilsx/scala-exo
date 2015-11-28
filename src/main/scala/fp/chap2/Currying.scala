package fp.chap2

/**
  * Created by cyril on 21.11.15.
  * Exercise 2.3, 2.4, 2.5
  */
object Currying {

  /**
    * Exercise 2.3
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
   def curry[A,B,C](f: (A, B) => C): A => (B => C) = A => B => f(A, B)

  /**
    * Exercise 2.4
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def uncurry[A,B,C](f: A => B => C): (A, B) => C = (a: A, b: B, c) => f(a, b,  )

  /**
    * Exercise 2.5
    * @param f
    * @param g
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def compose[A,B,C](f: A => B, g: B => C): (A=>C) = g compose f
}
