package parameters

import org.scalatest.FunSuite
import types.parameters._


class TestParameters extends FunSuite {

  test("test Pair Swap function") {
    val stringIntPair = new Pair("Test", 1)
    assert(stringIntPair.swap.first === 1)
    assert(stringIntPair.swap.second === "Test")
  }

  test("test replace first") {
    val cyrilAnaPair =new Pair4(new Person("Cyril", 10), new Person("Ana", 12))
    assert(cyrilAnaPair.replaceFirst(new Student(12, "Savvy", 10)).first === new Student(12, "Savvy", 10))
    assert(cyrilAnaPair.betterReplaceFirst(new Student(12, "Savvy", 10)).first === new Student(12, "Savvy", 10))
  }

  test("test replace smaller") {
    val cyrilAnaPair =new PairViewBound(10, 12)
    assert(cyrilAnaPair.smaller === 10)
  }

  test("test middle") {
    assert(Function.middle("Middle") === 'd')
  }


}
