package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Scanning {

    // By default, a Scanner uses white space to separate tokens

    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try{
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt"))); // so much wrapping!

            // non-default delimiter (regex)
            s.useDelimiter(",\\s*");    // removes the comma and whitespace

            while(s.hasNext()){
                System.out.println(s.next());
            }
        }
        finally{
            if(s != null)
                s.close();
        }


        // Translating tokens with Scanner
        Scanner scan = null;
        double sum = 0;

        try{
            scan = new Scanner(new BufferedReader(new FileReader("usnumbers.txt")));
            scan.useLocale(Locale.US);

            while(scan.hasNext()){
                if(scan.hasNextDouble())
                    sum += scan.nextDouble();
                else
                    scan.next();    // skip non-numbers
            }
        }
        finally{
            scan.close();
        }
        
        System.out.println();
        System.out.println(sum);
    }
}
