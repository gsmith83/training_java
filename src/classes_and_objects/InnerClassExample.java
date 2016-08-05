package classes_and_objects;

/*
 * This inner class example is also an example of a custom iterator
 */

public class InnerClassExample
{
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];
	
	// represents a data structure to iterate over
	public InnerClassExample()
	{
		for(int i = 0; i < SIZE; i++)
		{
			arrayOfInts[i] = i;
		}
	}
	
	// print the even indices of the array using a custom iterator
	public void printEven()
	{
		DataStructureIterator iterator = this.new EvenIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
	}
	
	interface DataStructureIterator extends java.util.Iterator<Integer>{}
	// Our Inner class implements this interface, which extends java's iterator for ints
	
	private class EvenIterator implements DataStructureIterator
	{
		// start stepping through the array from beginning
		private int nextIndex = 0;

		@Override
		public boolean hasNext()
		{
			return (nextIndex <= SIZE - 1);
		}

		@Override
		public Integer next()
		{
			Integer retval = Integer.valueOf(arrayOfInts[nextIndex]);
			
			nextIndex += 2;
			
			return retval;
		}
		
	}
	
	
	public static void main(String[] args)
	{
		InnerClassExample dataStructure = new InnerClassExample();
		dataStructure.printEven();
	}

}
