package InterfacesAndInheritance;

public class Polymorphism {

    public static void main(String[] args) {
        Bike bike1, bike2, bike3;
        
        bike1 = new Bike(10, 1);
        bike2 = new MountainBike(10,  1, "Dual");
        bike3 = new RoadBike(12, 1, 14);
        
        // demonstrate polymorphism
        bike1.printDescription();
        bike2.printDescription();
        bike3.printDescription();
    }

}

// Superclass
class Bike{
    int speed;
    int gear;
    
    public Bike(int startSpeed, int startGear){
        this.gear = startGear;
        this.speed = startSpeed;
    }
    
    public void printDescription(){
        System.out.println("\nBike is in gear " + this.gear + " and travelling at a speed of " + this.speed);
    }
}

// Subclasses
class MountainBike extends Bike{
    String suspension;

    public MountainBike(int startSpeed, int startGear, String suspension) {
        super(startSpeed, startGear);
        this.suspension = suspension;
    }
    
    public void printDescription(){
        super.printDescription();
        System.out.println("The mountain bike has a " + this.suspension + " suspension" );
    }
}

class RoadBike extends Bike{
    int tireWidth;
    
    public RoadBike(int startSpeed, int startGear, int tireWidth) {
        super(startSpeed, startGear);
        this.tireWidth = tireWidth;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("The road bike has " + this.tireWidth + "mm tires.");
    }
}
