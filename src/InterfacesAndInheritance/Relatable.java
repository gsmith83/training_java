package InterfacesAndInheritance;

public interface Relatable {
    
    // this and other must be instances of the same class
    // returns -1, 0, or 1 if this is less than, equal to, or greater than
    public int isLargerThan(Relatable other);
    
    // all methods are implicitly public
    int getArea();
    
    // A default method will allow two instances of different classes to be compared
    //  
    default int compareAreaTo(Relatable other){
        return this.getArea() - other.getArea();
    }
    
    // If you need to add another method later, will break all the objects implementing this interface
    //  Instead, create a new interface RelatablePlus that extends Relatable, and includes new method
    //  Alternatively, if the additional method is a default or static method, no new interface is necessary
}
