
package com.mycompany.blatt1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anastasiia Usacheva
 */
public class NumberInputStream extends InputStream {

    public static void main(String[] args) {
        try {
            Reader in = new InputStreamReader(new FileInputStream("zahlen_1.txt"));
            var zahl = in.read();
            
            while(zahl != -1){
                zahl = in.read();
            }
            
            in.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public int read() throws NumberToLargeException {
        //in einen String die einzelnen ziffern schreiben, bis Leerezeichen auftritt (ASCII: 32)
        //String in int parsen: Integer.valueOf(String name);
        int zahl = 0;
        //char[] buf = new char[1];
        //int count = InputStream.read(buf, 0, 1);
        return zahl;
    }
    
    
}
