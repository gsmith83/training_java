package classes_and_objects;

public class MethodParameters
{

	public static void main(String[] args)
	{
		// arbitray number of arguments
		printInts(1, 2, 3);
		printInts(5, 7, 9, 11, 13);	// print an arbitrary number of ints
		printInts(new int[]{1, 1, 2, 3, 5, 8, 13});	// can also pass in an array
	}
	
	// uses a construct varargs (type...)
	public static void printInts(int... integers)	// integers can be treated as an array
	{
		int n = integers.length;	
		
		for(int i = 0; i < n; i++)
		{
			System.out.printf("%d of %d = %d\n", i, n, integers[i]);
		}
	}
}
