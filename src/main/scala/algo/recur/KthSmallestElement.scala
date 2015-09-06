package algo.recur

/**
 * Created by cyril on 06.09.15.
 */
object KthSmallestElement {

  def kthSmallestElem(arr: Array[Int], k: Int) : Int = {
    if (arr.isEmpty)
      -1
    else if (arr.length == 1) {
      arr.head
    } else {
      val pivot = choosePivot(arr)
      val firstHalf: Array[Int] = arr.filter(e => e < pivot)
      if (firstHalf.length >= k) {
        kthSmallestElem(firstHalf, k)
      } else {
        kthSmallestElem(arr.filter(e => e > pivot), k - firstHalf.length)
      }
    }
  }

  /**
   * Bad pivot
   * @param arr
   * @return
   */
  def choosePivot(arr: Array[Int]): Int = {
    arr(0)
  }

}
