package classes_and_objects;

public class NestedClasses
{
	public static void main(String[] args)
	{
		
	}
	
	// static nested classes are Static Nested Classes
	static class StaticNestedClass
	{
		
	}
	
	// non-static nested classes are Inner Classes
	// Inner classes have access to members of the enclosing class (even private)
	// Instances of this class exist within an instance of the outer class
	class InnerClass
	{
		// NestedClasses.InnerClass innerObject = outerObject.new InnerClass();
	}
}
