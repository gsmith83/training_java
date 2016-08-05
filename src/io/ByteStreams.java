package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

    public static void main(String[] args) throws IOException {
        // Byte streams; all other stream types are build on byte streams
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("xanadu.txt"); // not best practice: use character streams to read characters
            out = new FileOutputStream("bytecopy.txt");
            
            int c;  // here, c holds a byte value in its last 8 bits
            while((c = in.read()) != -1){
                
                System.out.print(c);
                System.out.printf(" %c\n", c);
                
                out.write(c);
            }
        } finally {
            if(in != null)
                in.close();
            if(out != null)
                out.close();
        }
    }
}
