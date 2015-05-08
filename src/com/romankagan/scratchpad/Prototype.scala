package com.romankagan.scratchpad

import com.romankagan.languages.gettingstarted.SimpleSum
import org.scalatest.FunSuite

/**
 * Created by roman on 5/6/15.
 */
object Prototype extends App{

}

class Prototype  extends FunSuite {

  test("The sum should be 5") {
    val names = List("sid","helder","gina","g","roman","david")
    val result = names.filter(_.length>2)
      .map(_.capitalize).
      reduce(_+","+_)
    println(result)
    assert(SimpleSum.get_sum_for_test(2,3) == 5)


  }

//  test("Invoking head on an empty Set should produce NoSuchElementException") {
//    intercept[NoSuchElementException] {
//      Set.empty.head
//    }
//  }
}