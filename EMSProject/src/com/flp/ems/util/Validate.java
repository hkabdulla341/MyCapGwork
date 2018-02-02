package com.flp.ems.util;

public class Validate
{
    public static boolean validateName(String name)
    {
	final String REGEX = "(?i)^(?:[a-z]+(?: |\\. ?)?)+[a-z]$";

	return name.matches(REGEX);
    }

    public static boolean validateKin(String kinID)
    {
	return true;
    }

    public static boolean validatePhoneNo(String num)
    {
	try
	{
	    Integer.parseInt(num);
	    return true;
	}
	catch (NumberFormatException e)
	{
	    return false;
	}
    }

    public static boolean validateEmailID(String eMail)
    {
	final String REGEX = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";

	return eMail.matches(REGEX);
    }

    public static boolean validateDate(String Date)
    {
	return true; // use RegEx
    }

}
