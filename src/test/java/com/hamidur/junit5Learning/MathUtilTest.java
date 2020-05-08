package com.hamidur.junit5Learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@Tag("mathUtil")
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
        Assertions.assertEquals(expected, mathUtil.add(a, b), () -> "Method should add two numbers.");
    }

    @AfterEach
    void destroyEach()
    {
        mathUtil = null;
    }
}
