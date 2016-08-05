package numbers_and_strings;

public class Strings {
    public static void main(String[] args){
        // concat works with string literals
        String gotg = "My name is ".concat("Starlord");
        System.out.println(gotg);
        
        // formatting strings
        String fs = String.format("A float is %f, while an integer is %d", 2.13, 2);
        System.out.println(fs);
        
        // valueOf
        System.out.println(String.valueOf(111.2));
        
        // StringBuilder
        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();
        System.out.println(sb);
        // StringBuffer == StringBuilder (except it is thread safe)
    }
}
