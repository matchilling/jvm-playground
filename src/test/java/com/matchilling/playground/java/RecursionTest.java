package com.matchilling.playground.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void countDown() {
        Recursion.countDown(5);

        String expectedOutput = "5\n4\n3\n2\n1\n";

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void countUp() {
        Recursion.countUp(5);

        String expectedOutput = "1\n2\n3\n4\n5\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}