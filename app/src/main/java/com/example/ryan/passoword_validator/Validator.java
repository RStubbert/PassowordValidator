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
        //3 added rules

        //password is no longer than 24 characters
        if (password.length() > 24)
        {
            valid = false;
        }


        //Insure password has at least 1 lower case and 1 upper case letter
        if(password.equals(password.toLowerCase()) || password.equals(password.toUpperCase()))
        {
            valid = false;
        }

        //Insure password has at lease 1 number
        if(!Pattern.compile("[0-9]").matcher(password).find())
        {
            valid = false;
        }

        return valid;
    }


}