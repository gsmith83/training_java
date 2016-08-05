package language_basics;

public class BitwiseAndBitshift
{

	public static void main(String[] args)
	{
		byte complement = 127;
		
		int bitmask = 0x000F;
		int val = 0x2222;
		
		System.out.println(~complement);
		System.out.println(val & bitmask); 	// prints 2
	}

}
