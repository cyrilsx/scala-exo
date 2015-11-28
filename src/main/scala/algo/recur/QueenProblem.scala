package algo.recur

/**
 * Created by cyril on 08.09.15.
 */
object QueenProblem {

  case class Square(x: Int, y: Int)
/*
  def placeQueen(dimension: Int, queens: Seq[Square]) : Seq[Seq[Square]] = {
    if (dimension == 0)
      Seq(queens)
    else
      for(row <- 0 until dimension) {
        placeQueen(dimension - 1, /*new Square(row, dimension) ::*/ queens)
      }
  }
*/
  def isSafe(queensPlaced:Seq[Square], newPlace:Square): Boolean = {
    !queensPlaced.exists(q => q.x == newPlace.y || q.y == newPlace.y)
  }


/*  def diagonal(from: Square, until: Int): Seq[Square] = {
    Seq
  }
*/
}
