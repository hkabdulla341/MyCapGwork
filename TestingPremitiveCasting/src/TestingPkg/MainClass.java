package TestingPkg;

public class MainClass
{
    public static double intAndDoubleAdd(int a, double b)
    {
	return a + b; // upcast to double
    }

    public static float intAndFloatAdd(int a, float b)
    {
	return a + b;
    }
    
    public static long intAndLongAdd(int a, long b)
    {
	return a + b;
    }

    public static void main(String[] args)
    {
	byte b1 = 5;
	byte b3 = 'A'; // prints 65 , char to byte converts char to ASCII number
	// byte b2 = 5.5; -- cannot convert double to byte
	// byte b4 = "a"; -- cannot convert String to byte
	// byte b5 = (float) 8; -- cannot convert int/byte to float

	// System.out.println(b1 + " " + b3 + " " + b5);

	char ch1 = 65; // print A , num to char converts num to ASCII char
	char ch2 = 'A';
	// char ch3 = 65.0; -- cannot convert double to Char
	// char ch4 = "A"; -- cannot convert String to Char

	int i1 = 70;
	int i2 = 'A'; // print 65, char to int converts char to ASCII number
	// int i3 = 70.5; -- cannot convert double to int
	// int i4 = "A"; -- cannot convert String to int

	double d1 = (int) 80;// prints 80.0 , int to double converts int to
			     // double term i.e. 80 ==> 80.0
	double d2 = 'A'; // prints 65.0 , char to double converts char to ASCII
			 // int and then to double term.
	double d3 = 80.6;
	double d5 = (int) 90.6;// concats to 90.0 , then prints similar to
			       // double d1 variable above.
	// double d4 = "A"; -- cannot convert String to double
	double d6 = (float) 10.5;

	// System.out.println(d1 + " " + d2 + " " + d3 + " " + d6);

	float f1 = 80; // prints 80.0
	float f2 = 'A'; // prints 65.0
	float f3 = (float) 90.8; // prints 90.8
	// float f4 = 100.0; -- cannot convert double to float (this suggest
	// that java default floating point variable is double
	// float f5 = "abc"; -- cannot convert String to double

	// System.out.println(f1 + " " + f2 + " " + f3);

	// Int is upcasted to double
	System.out.println("Add int and double : " + MainClass.intAndDoubleAdd(10, 10));

	// Int is upcasted to double
	System.out.println("Add int and float : " + MainClass.intAndFloatAdd(10, 10));
	
	System.out.println("Add int and long : " + MainClass.intAndLongAdd(10, 10));
    }
}
