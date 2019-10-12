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

  def factorialNotTailOptimised(number: Int): Int = {
    if (number == 0) return 1
    number * factorialNotTailOptimised(number - 1)
  }

  def factorial(number: Int): Int = {
    @tailrec
    def iterator(number: Int, result: Int): Int = {
      if (number == 0) return result
      iterator(number - 1, result * number)
    }

    iterator(number, 1)
  }
}
