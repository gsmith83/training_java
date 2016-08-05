package InterfacesAndInheritance;

public class OperateBMW implements OperateCar {

    @Override
    public int turn(Direction direction) {

        switch(direction){
        case LEFT:
            System.out.println("BMW turned left");
            break;
        case RIGHT:
            System.out.println("BMW turned right");
        }
        return 0;
    }

    @Override
    public int signalTurn(Direction direction, boolean signalOn) {
        // code to signal a turn
        return 0;
    }

    
    
    public static void main(String[] args) {
        // OperateCar object is guaranteed to include all OperateCar's methods
        OperateCar bmw = new OperateBMW();
        
        // using our implementation of method signatures
        bmw.turn(Direction.LEFT);
        bmw.turn(Direction.RIGHT);
        
        // using a default method
        bmw.accelerate(55);
        
        // using a static method
        OperateCar.honk();
    }

}
