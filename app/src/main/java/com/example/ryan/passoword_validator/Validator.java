package com.example.ryan.passoword_validator;


import java.util.regex.Pattern;

public class Validator
{



    /**
     * Checks if given sting is valid or not
     *
     * @param password the string representing the password
     *
     * @return if the password is valid or not
     */
    public static boolean validate(String password)
    {

        boolean valid = true;

        //Required Rules

        //check if password is password
        if (password.equalsIgnoreCase("password"))
        {
            valid = false;
        }
        //check if password is greater than 7 chars
        if (password.length() < 8)
        {
            valid = false;
        }

        return valid;
    }


}