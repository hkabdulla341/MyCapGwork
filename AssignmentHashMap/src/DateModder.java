

import java.text.*;
import java.util.*;

public class DateModder
{
    private static Date dateMod(String strDate)
    {
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	Date aDate = null;

	try
	{
	    aDate = df.parse(strDate);
	}
	catch (ParseException e)
	{
	    System.out.println("Unexcepted date (MM/YYY) Format : " + strDate);
	}

	return aDate;
    }

    public static Date getDate(String strDate)
    {
	Date aDate = dateMod(strDate);
	return aDate;
    }

}
