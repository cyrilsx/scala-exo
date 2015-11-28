package fp.chap3


sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def sum(ints: List[Int]): Int = {
    ints match {
      case Nil => 0
      case Cons(x, xs) => x + sum(xs)
    }
  }


  def apply[A](argv: A*): List[A] = {
    if (argv.isEmpty) Nil
    else Cons(argv.head, apply(argv.tail: _*))
  }

  /**
    * exercise 3.2
    * @param elems
    * @tparam A
    * @return
    */
  def tail[A](elems: List[A]): List[A] = {
    elems match {
      case Nil => Nil
      case Cons(x, xs) => xs
    }
  }

  /**
    * exercise 3.3
    * @param elems
    * @param head
    * @tparam A
    * @return
    */
  def setHead[A](elems: List[A], head: A): List[A] = {
    elems match {
      case Nil => Cons(head, Nil)
      case Cons(x, xs) => Cons(head, xs)
    }
  }

  /**
    * exercise 3.4
    * @param elems
    * @param n
    * @tparam A
    * @return
    */
  def drop[A](elems: List[A], n: Int): List[A]= {
    elems match {
      case Nil => Nil
      case Cons(x, xs) => if (n <= 0) xs else drop(xs, n - 1)
    }
  }

  /**
    * exercise 3.5
    * @param elems
    * @param f
    * @tparam A
    * @return
    */
  def dropWhile[A](elems: List[A], f: A => Boolean): List[A] = {
    elems match {
      case Nil => Nil
      case Cons(x, xs) => if (f(x)) xs else dropWhile(xs, f)
    }
  }
}
