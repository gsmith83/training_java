package InterfacesAndInheritance;

/*
 * If you want to be able to compare the size of similar objects, no matter what they are,
 * the dclass that instantiates them should implement Relatable
 */

public class RectanglePlus implements Relatable{
    public int width = 0;
    public int height = 0;
    
    public RectanglePlus() {    }
    public RectanglePlus(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    // a method for computing the area of a rectangle
    @Override
    public int getArea(){
        return width * height;
    }
    
    // method required to override to implement Relatable interface
    @Override
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus)other;
        
        if(this.getArea() < otherRect.getArea())
            return -1;
        else if(this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }
}
