package com.hamidur.junit5Learning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@DisplayName("Testing - EmailValidator")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class EmailValidatorTest
{
    @BeforeAll
    @DisplayName("initializer")
    static void init()
    {
        System.out.println("initializing some resources before running anything from this class.");
    }

    @Test
    @DisplayName("email tester")
    void testEmail()
    {
        System.out.println("running testEmail()");
    }

    @AfterAll
    @DisplayName("destroyer")
    static void destroy()
    {
        System.out.println("cleaning up some intensive resources after running all tests.");
    }
}
