package InterfacesAndInheritance;

public class RelatableObjects {

    public static void main(String[] args) {
        Relatable cir1 = new CirclePlus(25);
        Relatable cir2 = new CirclePlus(50);
        Relatable rect1 = new RectanglePlus(20, 20);
        Relatable rect2 = new RectanglePlus(100, 100);
        
        // Comparing the same type of object
        System.out.println(cir2.isLargerThan(cir1));
        System.out.println(rect1.isLargerThan(rect2));
        
        // Comparing different types
        try{
            System.out.println(cir1.isLargerThan(rect1));
        }catch(Exception e){
            System.out.println("Cannot compare objects: " + e.getMessage());
        }
        
        System.out.println(cir1.compareAreaTo(rect1));
    }
}
