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
        try {
            int number;
            //array list nehmen und da die chars einspeichern
            // brauche ich nicht: byte[] b = new byte[1];
            int zahl = read(b, 0, 1);
            //wenn er eine leerzeichen liest, dann muss der den char array list als string auswerten und ausgeben
        } catch (IOException ex) {
            Logger.getLogger(NumberInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
