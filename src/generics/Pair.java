package generics;

public class Pair<K extends Number, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    public K getKey(){
        return key;
    }
    
    public V getValue(){
        return value;
    }
    
    // Because key is a Number, we can call intValue() on key
    public boolean isEven() {
        return key.intValue() % 2 == 0;
    }
}
