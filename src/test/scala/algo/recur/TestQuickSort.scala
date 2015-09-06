package algo.recur

import org.scalatest.FunSuite

/**
  * Created by cyril on 06.09.15.
  */
class TestQuickSort extends FunSuite {


   test("test quicksort function") {
     val unsortedArray = Array(15, 2, 47, 20, 8, 78, 96, 3, 100, 15, 12, 18, 56)
     println(QuickSort.quickSort(unsortedArray).mkString(","))
   }

 }
