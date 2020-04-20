package com.hamidur.junit5Learning;

public class EmailValidator
{
    private static final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public EmailValidator() {}

    public boolean isValid(String email)
    {
        return email.toLowerCase().matches(emailRegex);
    }

    public final String getEmailRules()
    {
        return "A valid email must have the followings in user-name part and domain part.\n" +
                "1. A-Z characters are permitted.\n"+
                "2. a-z characters are permitted.\n"+
                "3. 0-9 digits are permitted.\n"+
                "4. Underscore(_), dash(-), and dot(.) are permitted.\n"+
                "5. Other characters are not permitted.\n";
    }

    public static void main(String[] args) {
        System.out.println(new EmailValidator().isValid("random@email.com"));
    }
}
