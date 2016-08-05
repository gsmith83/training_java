package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharacterStreams {

    public static void main(String[] args) throws IOException {
        // character streams
        FileReader inputStream = null;
        FileWriter outputStream = null;
        
        try{
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("charactercopy.txt");
            
            int c;  // here, c holds a character value in its last 16 bits
            while((c = inputStream.read()) != -1){
                System.out.println(c);
                outputStream.write(c);
            }
        }
        finally{
            if(inputStream != null)
                inputStream.close();
            if(outputStream != null)
                outputStream.close();
        }
        
        // Line-Oriented I/O
          // BufferedReader and BufferedWriter reduces overhead of many read/write requests
        BufferedReader inputBufferedReader = null;
        PrintWriter outputWriter = null;
        
        try{
            inputBufferedReader = new BufferedReader(new FileReader("xanadu.txt"));
            outputWriter = new PrintWriter(new FileWriter("linecharactercopy.txt"));
            
            String line;
            while((line = inputBufferedReader.readLine()) != null){
                outputWriter.println(line);
            }
            
            outputWriter.flush();
        }
        finally{
            if(inputBufferedReader != null)
                inputBufferedReader.close();
            if(outputWriter != null)
                outputWriter.close();
        }
    }
}
