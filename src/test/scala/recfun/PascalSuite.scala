package recfun

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
  import Main_01.pascal
  test("pascal: col=0,row=2") {
    assert(pascal(0,2) === 1)
  }

  test("pascal: col=1,row=2") {
    assert(pascal(1,2) === 2)
  }

  test("pascal: col=1,row=3") {
    assert(pascal(1,3) === 3)
  }

  test("pascal: col=7,row=2") {
    assert(pascal(2, 7) === 21)
  }

  test("pascal: col=9,row=9") {
    assert(pascal(9, 9) === 1)
  }

  test("pascal: col=10,row=5") {
    assert(pascal(5, 10) === 252)
  }
}

