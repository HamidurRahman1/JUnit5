package com.hamidur.junit5Learning;

public class EmailValidator
{
    /*
        This regex is taken from google.

        A valid email must have the followings in user-name part and domain part.

        1. A-Z characters are permitted
        2. a-z characters are permitted
        3. 0-9 digits are permitted
        4. Underscore(_), dash(-), and dot(.) are permitted
        5. Other characters are not permitted
    */

    private static final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]";

    public EmailValidator() {}

    public boolean isValid(String email)
    {
        return email.toLowerCase().matches(emailRegex);
    }

    public final String getEmailRules()
    {
        return "1. A-Z characters are permitted.\n"+
                "2. a-z characters are permitted.\n"+
                "3. 0-9 digits are permitted.\n"+
                "4. Underscore(_), dash(-), and dot(.) are permitted.\n"+
                "5. Other characters are not permitted.\n";
    }
}
