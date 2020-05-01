package Labkada

import org.scalatest._

class MyTest extends FlatSpec
{

  "Swap()" must "return the same List, but neighbour elements are swapped" in {
    assert(Change.Swap(List(3,5,7,9))==List(5,3,9,7))
    assert(Change.Swap(List(3,5,7,9,1))==List(5,3,9,7,1))
  }

  "containsWithTailRec() and MyContains.containsWithFold()" must "return true(Boolean) if list contains this element, false(Boolean) if not" in {
   val xs=List(1,3,5,7,9)
    assert(MyContains.containsWithTailRec(xs,6) == false)
    assert(MyContains.containsWithFold(xs,3) == true)
  }

  "onlyString() and onlyInt()" must "work well with filter" in {
    val xS = List("Ded", "s`el", 2, 3, "deda")
    assert(xS.filter(FilterByType.onlyString)==List("Ded", "s`el", "deda"))
    assert(xS.filter(FilterByType.onlyInt)==List(2, 3))

  }
}
