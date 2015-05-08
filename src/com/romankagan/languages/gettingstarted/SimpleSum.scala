package com.romankagan.languages.gettingstarted

/**
 * Created by roman on 5/6/15.
 */

object SimpleSum extends App{
  def get_sum(a: Int, b: Int):Unit = {
    println(get_sum_for_test(a,b))
  }

  def get_sum_for_test(a: Int, b: Int):Int = {
    a+b
  }
}
