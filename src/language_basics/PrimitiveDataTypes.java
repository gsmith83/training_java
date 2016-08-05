package language_basics;

public class PrimitiveDataTypes
{
	static int classField;

	public static void main(String[] args)
	{
		// integer literals
		int decVal = 15;
		int binVal = 0b1111;	// binary
		int hexVal = 0x0f;		// hex
		// float literals
		double d1 = 123.4;
		double d2 = 1.234e2;	// scientific notation
		float f1 = 123.4f;		// float
		// string and char literals
		String hello = "Hello";
		char c = 'c';
		
		// underscores in literals (helps with readability only)
		long ssn = 999_99_9999L;	// only placed BETWEEN digits
		
		
		
		// printf formatting
		System.out.println("Decimal Value = " + decVal);
		System.out.printf("Binary Value  = %s\n", Integer.toString(binVal, 2));	// no binary format specifier
		System.out.printf("Hex Value     = 0x%x\n", hexVal);
		
		System.out.println("D1 = " + d1);
		System.out.printf("D2 = %.3e\n",d2);	// only 3 decimal digits in scientific notation
		System.out.println("F1 = " + f1);
		
		System.out.println(hello);
		System.out.println(c);
		
		System.out.println(ssn);	// does NOT print underscores
		
		System.out.println(classField);	// static var uninitialized, but prints 0 OK
	}

}
