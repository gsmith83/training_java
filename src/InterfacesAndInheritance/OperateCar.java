package InterfacesAndInheritance;

// An interface is a "contract" that spells out how software interacts.
// Defines methods and data that can be used 

/*
 *  An interface is a reference type that can contain only constants, method signatures
 *  default methods, static methods, and nested types.
 *  Cannot be instantiated, only implemented (by classes) or extended (by other interfaces)
 */
public interface OperateCar {

    public enum Direction{
        LEFT, RIGHT
    }
    
    // method signatures
    int turn(Direction direction);
    int signalTurn(Direction direction, boolean signalOn);
    // ... more method signatures
    
    
    // Default methods
    default void accelerate(int speed){
        System.out.println("Car accelerates to " + speed);
    }
    
    // Static methods
    static void honk(){
        System.out.println("HONK!");
    }
}
