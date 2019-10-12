package com.matchilling.playground.scala

import java.io.{ByteArrayOutputStream, PrintStream}

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.{AfterEach, BeforeEach, Test}

class RecursionTest {
  final private val outContent = new ByteArrayOutputStream
  final private val originalOut = System.out

  @BeforeEach
  def setUpStreams(): Unit = {
    System.setOut(new PrintStream(outContent))
  }

  @AfterEach
  def restoreStreams(): Unit = {
    System.setOut(originalOut)
  }

  @Test
  def countDown(): Unit = {
    Recursion.countDown(5)
    val expectedOutput = "5\n" + "4\n" + "3\n" + "2\n" + "1\n"
    assertEquals(expectedOutput, outContent.toString)
  }

  @Test
  def countUp(): Unit = {
    Recursion.countUp(5)
    val expectedOutput = "1\n" + "2\n" + "3\n" + "4\n" + "5\n"
    assertEquals(expectedOutput, outContent.toString)
  }
}