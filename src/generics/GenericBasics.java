package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericBasics {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(1);
        
        // non-generic
        String hello = (String)list.get(0);
        int one = (int)list.get(1);
        System.out.println(hello + " " + one);
        
        // non-generic; incorrect casting -> exception
//        String hello2 = (String)list.get(1);
//        int one2 = (int)list.get(0);
//        System.out.println(hello2 + " " + one2);
        
        // generic
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("1");
        System.out.println(stringList.get(0) + " " + stringList.get(1));
        
        // Box example
        Box<Integer> intBox = new Box<>();
        intBox.set(new Integer(12345));
        System.out.println(intBox.get());
        
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello world!");
        System.out.println(stringBox.get());
        
        // Raw types are generic classes or interfaces without type arguments; for backwards compatibility
        Box rawBox = new Box();
        rawBox.set("Goodbye");
        System.out.println(rawBox.get());
        
        // Using a generic method
        Pair<Integer, String> p1 = new Pair(1, "apple");
        Pair<Integer, String> p2 = new Pair(1, "pear");
        Pair<Integer, String> p3 = new Pair(1, "apple");
        System.out.println("p1 == p2 " + compare(p1, p2));
        System.out.println("p1 == p3 " + compare(p1, p3));
        
        // You cannot instantiate generic types with primitive types
//        Pair<int, char> p = new Pair(89, 'a');
        Pair<Integer, Character> p = new Pair(89, 'a'); // autoboxes int 89 -> Integer.valueOf(89) etc.
    }
    
    // a generic method includes the type parameter section must appear before the return type
    // Pairs can only have Number keys
    public static <K extends Number, V> boolean compare(Pair<K, V> pair1, Pair<K, V> pair2){
        return pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue());
    }

}
