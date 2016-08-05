package numbers_and_strings;

import java.util.Calendar;
import java.util.Locale;

public class Numbers {

    public static void main(String[] args) {
        // Integer static methods
        Integer decodedInteger = Integer.decode("11");
        System.out.println(decodedInteger);
        System.out.println();
        
        System.out.println(Integer.parseInt("11", 2));
        System.out.println(Integer.parseInt("11", 16));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println();
        
        System.out.println(Integer.toString(10, 2));
        System.out.println(Integer.toString(10, 16));
        System.out.println(Integer.toHexString(10));    // same as above
        System.out.println(Integer.toString(10, 10));
        System.out.println();
        
        // printf == format
        System.out.format("The value of i is %d%n", 12345); // format same as printf; %n is platform-independent
        System.out.format(Locale.FRANCE, "French decimals be like %f%n", 5.4321);
        Calendar c = Calendar.getInstance();
        System.out.printf("%tl:%tM %tp%n", c, c, c);
        System.out.printf("%tB %te, %tY%n", c, c, c);
        System.out.printf("%tm/%td/%ty%n", c, c, c);
        System.out.printf("%tD%n", c);  // same as above
        System.out.println();
        
        // Math.random
        double randomDouble = Math.random();   // will be between 0.0 and 1.0
        System.out.println(randomDouble);
        int randomInt = (int)(Math.random() * 10);  // will be between 0 and 9
        System.out.println(randomInt);
        
        // characters
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('C'));
    }

}
