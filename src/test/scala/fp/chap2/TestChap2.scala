package fp.chap2

import fp.chap2.Sorted.isSorted

/**
  * Created by cyril on 21.11.15.
  */
class TestChap2 extends org.scalatest.FunSuite {


  test("test fibonacci of 5 equal to 24") {
    assert(Fibonacci.fibonacci(5) === 24)
   }

  test("test if sorted ok") {
    assert(isSorted(Array(1, 2, 3, 4, 5), (a:Int, b:Int) => a < b) === true)
  }

  test("test if sorted fail") {
    assert(isSorted(Array(1, 3, 2, 4, 5), (a:Int, b:Int) => a < b) === false)
  }

}
