package com.hamidur.junit5Learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Random;

@Tag("math")
@DisplayName("MathUtilTest")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MathUtilTest
{
    private MathUtil mathUtil;

    @BeforeEach
    void init()
    {
        mathUtil = new MathUtil();
    }

    @Test
    void testAdd()
    {
        int a = 1;
        int b = 1;
        int expected = a+b;
        Assertions.assertEquals(expected, mathUtil.add(a, b), () -> "should add two numbers.");
    }

    @RepeatedTest(5)
    @DisplayName("Randomized multiply() test")
    void testMultiply(RepetitionInfo repetitionInfo)
    {
        // use repetitionInfo if conditional repetition is used

        Random random = new Random();
        int a = random.nextInt(50);
        int b = random.nextInt(100);
        int expected = a*b;

        Assertions.assertEquals(expected, mathUtil.multiply(a, b), () -> "should multiply two numbers.");
    }

    @Test
    @DisplayName("Exception testing with divide()")
    void testDivide()
    {
        int a = 1;
        int b = 0;

        Assertions.assertThrows(ArithmeticException.class, () -> mathUtil.divide(a, b));
    }

    @Test
    @DisplayName("Assert all with add()")
    void testAdds()
    {
        Assertions.assertAll("MathUtil features test at once",
                () -> Assertions.assertEquals(4, mathUtil.add(1, 3)),
                () -> Assertions.assertEquals(0, mathUtil.sub(2, 2)),
                () -> Assertions.assertEquals(6, mathUtil.multiply(2, 3)),
                () -> Assertions.assertEquals(2, mathUtil.divide(4, 2)));
    }

    @AfterEach
    void destroyEach()
    {
        mathUtil = null;
    }
}
