package algo.recur

import org.scalatest.FunSuite

/**
  * Created by cyril on 06.09.15.
  */
class TestKthSmallestElem extends FunSuite {


   test("test quicksort function") {
     val unsortedArray = Array(15, 2, 47, 20, 8, 78, 96, 3, 100, 15, 12, 18, 56)
     assert(KthSmallestElement.kthSmallestElem(unsortedArray, 4) === 12)
   }

 }
