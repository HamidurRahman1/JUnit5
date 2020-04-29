package com.hamidur.junit5Learning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Testing - EmailValidator")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class EmailValidatorTest
{
    EmailValidator emailValidator;

    @BeforeAll
    static void init()
    {
        System.out.println("initializing some resources before running anything from this class.");
    }

    @BeforeEach
    void initEach()
    {
        emailValidator = new EmailValidator();
    }

    @Test
    @DisplayName("email tester")
    void testEmail()
    {
        String emailToTest = "random@email.com";

        boolean actual = emailValidator.isValid(emailToTest);

        Assertions.assertTrue(actual,"Email should have been validated to pass the test.");
    }

    @Test
    void testEmail2()
    {
        String emailToTest = "+InvalidName@~invalidDomain.com";

        Assertions.assertFalse(emailValidator.isValid(emailToTest),"Email should have been validated to pass the test.");
    }

    @AfterAll
    static void destroy()
    {
        System.out.println("cleaning up some intensive resources after running all tests.");
    }
}
