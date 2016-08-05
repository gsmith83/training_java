package InterfacesAndInheritance;

public class SubclassObject{
    public String id;
    
    public SubclassObject(String id){
        this.id = id;
    }
    
    // A final method CANNOT be overridden
    //  Note: A final CLASS cannot be extended
    final int getNumberOne(){
        return 1;
    }
    
    
    // demonstrate Object's inherited methods
    public static void main(String[] args) {
        SubclassObject sub = new SubclassObject("Subclass of Object");
        
        // clone
        // Class must implement cloneable interface
        try{
            SubclassObject clone = (SubclassObject)sub.clone();
            System.out.println(clone.id);
        }
        catch(CloneNotSupportedException e){
            System.out.println("Class must implement cloneable. " + e.getMessage());
        }
        
        // equals
        //  If you override equals, you must override hashCode also
        SubclassObject notEqualSub = new SubclassObject("Subclass of Object");
        System.out.println("Sub == notEqualSub? " + sub.equals(notEqualSub));
        System.out.println("Sub == Sub? " + sub.equals(sub));
        
        // getClass
        //  Cannot be overridden; Class object has many useful methods
        Class subClass = sub.getClass();
        System.out.println(subClass.getSimpleName() +" "+ subClass.getSuperclass().getSimpleName() +" "+ subClass.getFields()[0]);
    }

}
