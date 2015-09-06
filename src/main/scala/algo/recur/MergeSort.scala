package algo.recur


object MergeSort {

  def mergeSorted(arr: Array[Int]) : Array[Int] = {
    if (arr.length <= 1)
      arr
    else {
      merge(mergeSorted(arr.slice(0, arr.length/2)), mergeSorted(arr.slice(arr.length/2,arr.length)))
    }
  }

  def merge(sortedArrLeft: Array[Int], sortedArrRight: Array[Int]): Array[Int] = {
    if (sortedArrLeft.length == 0) {
      sortedArrRight
    } else if (sortedArrRight.length == 0) {
      sortedArrLeft
    } else if (sortedArrLeft.head > sortedArrRight.head) {
      sortedArrRight.head +: merge(sortedArrLeft, sortedArrRight.tail)
    } else {
      sortedArrLeft.head +: merge(sortedArrLeft.tail, sortedArrRight)
    }
  }

}
