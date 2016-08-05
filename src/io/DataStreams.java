package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

// DataStreams support I/O of primitive data types and strings; 
//  ObjectStreams can work on Objects

public class DataStreams {

    static final String dataFile = "invoicedata";
    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = { "Java T-shirt", "Java Mug", "Duke Dolls", "Java Pin", "Java Key Chain"};
    
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
        
        for(int i = 0; i < prices.length; i++){
            out.writeDouble(prices[i]);
            out.writeInt(units[i]);
            out.writeUTF(descs[i]);
        }
        
        out.flush();
        
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
        double price;
        int unit;
        String desc;
        
        try{
            while(true){
                // must match the order of writes
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.printf("Order: %d units of %s at $%.2f%n", unit, desc, price);
            }
        }
        catch(EOFException e){}
    
        
        // Using ObjetStreams
        BigDecimal bd = new BigDecimal("1.0000001");
        ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
        
        objout.writeObject(bd);
        objout.flush();
    }

}
