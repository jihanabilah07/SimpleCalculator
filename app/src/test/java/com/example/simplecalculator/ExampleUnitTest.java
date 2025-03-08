package com.example.simplecalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExampleUnitTest {

    /*
     * Test Case 1: Menguji operasi penjumlahan dua angka positif.
     * Input: 5 + 3
     * Expected Output: 8
     */
    @Test
    public void testAddition() {
        int result = CalculatorUtils.addNumbers(5, 3);
        assertEquals(8, result);
    }

    /*
     * Test Case 2: Menguji operasi penjumlahan dengan angka nol.
     * Input: 7 + 0
     * Expected Output: 7
     */
    @Test
    public void testAdditionWithZero() {
        int result = CalculatorUtils.addNumbers(7, 0);
        assertEquals(7, result);
    }

    /*
     * Test Case 3: Menguji operasi penjumlahan dua angka negatif.
     * Input: -2 + (-3)
     * Expected Output: -5
     */
    @Test
    public void testNegativeNumbers() {
        int result = CalculatorUtils.addNumbers(-2, -3);
        assertEquals(-5, result);
    }
}
