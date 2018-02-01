package com.flp.ems.util;

public class Validate
{
    public static boolean validateName(String name)
    {
	final String REGEX = "(?i)^(?:[a-z]+(?: |\\. ?)?)+[a-z]$";
	
	return name.matches(REGEX);
    }

    public static boolean validateKin(String name)
    {
	return true;
    }

    public static boolean validatePhoneNo(String name)
    {
	return true;
    }

    public static boolean validateEmailID(String name)
    {
	return true;
    }

    public static boolean validateDate(String name)
    {
	return true; // use RegEx
    }

}
