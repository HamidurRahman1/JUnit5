package com.hamidur.junit5Learning;

public class MathUtil
{
    public int add(int a, int b)
    {
        return a+b;
    }

    public int sub(int a, int b)
    {
        return a-b;
    }

    public int multiply(int a, int b)
    {
        return a*b;
    }

    public int divide(int a, int b) throws ArithmeticException
    {
        if(b == 0) throw new ArithmeticException();
        return a/b;
    }
}
