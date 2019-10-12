package com.matchilling.playground.scala

import scala.annotation.tailrec

object Recursion {

  @tailrec
  def countDown(number: Int): Unit = {
    if (number > 0) {
      println(number)
      countDown(number - 1)
    }
  }

  def countUp(number: Int): Unit = {
    if (number > 0) {
      countUp(number - 1)
      println(number)
    }
  }
}
