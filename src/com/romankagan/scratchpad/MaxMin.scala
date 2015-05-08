package com.romankagan.scratchpad

/**
 * Created by roman on 5/6/15.
 */
object MaxMin {

  val grades = List(1,2,3,4,5,3,2,1,5,15,6)
  var max = 0
  //grades.foreach(x)


  val names = List("sid","helder","gina","g","roman","david")
  val result = names.filter(_.length>2)
  .map(_.capitalize).
  reduce(_+","+_)
  println(result)

}
