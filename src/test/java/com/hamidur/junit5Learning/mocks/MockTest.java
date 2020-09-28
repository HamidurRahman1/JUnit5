package com.hamidur.junit5Learning.mocks;

import com.hamidur.junit5Learning.EmailValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockTest
{
    @Mock
    private EmailValidator emailValidator;

    @Test
    public void test()
    {
        System.out.println(emailValidator.getEmailRules());
    }
}
