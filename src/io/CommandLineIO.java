package io;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class CommandLineIO {

    public static void main(String[] args) throws FileNotFoundException {
        
        // change system.out to print to a file
            // save system.out
        PrintStream stdout = System.out;
        
        System.setOut(new PrintStream("hello.txt"));
        System.out.println("Hello world!");
//        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));  // changing back alternative (if stdout not saved)
        System.setOut(stdout);   // change back
        System.out.println("Goodbye world!");
        
        
        // The Console; a predefined object type; useful for secure password entry and input/output true character streams
        // Console ops may not be permitted (by OS or if the program is launched in non-interactive environment
        Console c = System.console();
        if(c == null){
            System.err.println("No console");
            System.exit(-1);
        }
        
        String login = c.readLine("Enter your login: ");
        char[] password = c.readPassword("Enter your password: ");
        
        System.out.printf("You entered %s\n%s\n", login, password.toString());
    }
}
