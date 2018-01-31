package MainPkg;

class Temp
{
    public static void main(String[] args)
    {
	String str2 = "abc";
	String str1 = new String("abc");
	String str3 = str1;

	System.out.println("str1 == str2 : " + (str1 == str2));
	System.out.println("str3 == str2 : " + (str3 == str2));
	System.out.println("str1.equals(str2) : " + str1.equals(str2));
	System.out.println("str3.equals(str1) : " + str3.equals(str1));

	Integer iA = 1;
	Integer iB = 1;
	Integer iC = iA;
	Integer iD = new Integer(1);
	Integer iE = new Integer(1);

	System.out.println("iA == iB : " + (iA == iB));
	System.out.println("iC == iB : " + (iC == iB));
	System.out.println("iD == iE : " + (iD == iE));
	System.out.println("iD == iA : " + (iD == iA));
	System.out.println("iA.equals(iB) : " + (iA.equals(iB)));
	System.out.println("iC.equals(iB) : " + (iC.equals(iB)));
	System.out.println("iD.equals(iE) : " + (iD.equals(iE)));
	System.out.println("iA.equals(iD) : " + (iA.equals(iD)));

	int num1 = 10;
	int num2 = 20;

	boolean t = true;

	if (t = false)
	{
	    System.out.println("2");
	}
	else
	{
	    System.out.println("3");
	}

	String str = "abc";
	str.length();

	char[] ca = { 0x4e, '\u004e', 78 };

	System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));

    }
}