package types.parameters


class Person(name: String, age: Int)
case class Student(rank: Int, name: String, age: Int) extends Person(name, age)

/**
 * Exo 1,2,3: Scala for the impatient.
 * @param first
 * @param second
 * @tparam F
 * @tparam S
 */
class Pair[F, S](val first: F, val second: S) {

  def swap: Pair[S, F] = new Pair(second, first)
  def swap(first: F, second: S) = new Pair(second, first)

}

class Pair4[T](val first: T, val second:T) {
  def replaceFirst(newFirst: T) = new Pair4(newFirst, second)
  /** Lower Bound Function */
  def betterReplaceFirst[F >: T](newFirst: F) = new Pair4(newFirst, second)
}

/**
 * Wildcard and covariant type
 * @param first
 * @param second
 * @tparam T
 */
class Pair2[+T](val first: T, val second: T) {
  def makeFriend(newFriend : Pair2[_ >: T]): Unit = {

  }
}

class PairViewBound[T <% Ordered[T]](val first: T, val second: T) {
  def smaller = if (first < second) first else second
}

object Function {

  /**
   * exo 6
   * @param iterable
   * @tparam T
   * @return
   */
  def middle[T](iterable: Iterable[T]) = {
    val middle: Int = iterable.size / 2
    iterable.toList(middle)
  }

  def test = {
    val pair: Pair2[Person] = new Pair2(new Person("Test", 12), new Person("Test", 12))
    // Illegal
    pair.makeFriend(new Student(12, "Coin", 12))
    pair.makeFriend(new Person("Coin", 12))
  }
}
