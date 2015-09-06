package algo.recur


object QuickSort {


  def quickSort(arr: Array[Int]) : Array[Int] = {
    if (arr.length <= 1) {
      arr
    } else {
      val pivot = choosePivot(arr)
      quickSort(arr.filter(e => e < pivot)) ++ Array(pivot) ++ quickSort(arr.filter(e => e > pivot))
    }
  }


  /**
   * Bad Pivot
   * @param arr
   * @return
   */
  def choosePivot(arr: Array[Int]): Int = {
      arr(0)
  }
}
