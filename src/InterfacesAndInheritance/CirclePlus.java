package InterfacesAndInheritance;

public class CirclePlus implements Relatable {
    int radius = 0;
    
    public CirclePlus(){}
    public CirclePlus(int radius){
        this.radius = radius;
    }
    
    @Override
    public int isLargerThan(Relatable other) {
        CirclePlus otherCircle = (CirclePlus)other;
        
        if(this.getArea() > otherCircle.getArea())
            return 1;
        else if(this.getArea() < otherCircle.getArea())
            return -1;
        else
            return 0;
    }

    
    // Calculates a circles area rounded to nearest integer
    @Override
    public int getArea() {
        return (int) (Math.PI * this.radius * this.radius);
    }

}
