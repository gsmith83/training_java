package classes_and_objects;

import java.util.TreeSet;

public class AnonymousAndLocalClasses
{
	interface HelloWorld
	{
		public void greet();
		public void greetSomeone(String someone);
	}
	
	public void sayHello()
	{
		// local class inside of a method
		class EnglishGreeting implements HelloWorld
		{
			String name = "world";
			public void greet()
			{
				greetSomeone("world");
			}
			
			public void greetSomeone(String someone)
			{
				name = someone;
				System.out.println("Hello " + name);
			}
		}
		
		HelloWorld englishGreeting = new EnglishGreeting();
		
		
		// Anonymous class
		HelloWorld frenchGreeting = new HelloWorld()
		{
			String name = "le monde";
			
			public void greet()
			{
				greetSomeone("le monde");
			}

			public void greetSomeone(String someone)
			{
				name = someone;
				System.out.println("Allo " + name);
			}
		};	// the anonymous class ends with a semicolon (because they are expressions)
		
		englishGreeting.greet();
		englishGreeting.greetSomeone("computer");
		frenchGreeting.greet();
		frenchGreeting.greetSomeone("frenchie");
	}

	public static void main(String[] args)
	{
		AnonymousAndLocalClasses myApp = new AnonymousAndLocalClasses();
		myApp.sayHello();
	}

}
