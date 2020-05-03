package com.hamidur.junit5Learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
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

    @AfterEach
    void destroyEach()
    {
        mathUtil = null;
    }
}
