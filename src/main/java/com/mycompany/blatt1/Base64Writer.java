
package com.mycompany.blatt1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author nasty
 */
public class Base64Writer extends OutputStreamWriter{

    public Base64Writer(OutputStream out, String charsetName) throws UnsupportedEncodingException {
        super(out, charsetName);
    }
    
    /**
     * Überarbeitete write Methode
     * 
     * @param str String, der codiert werden soll
     * @param startPosition Startposition, wo die kodierung geschrieben werden soll 
     * @param charactersToWrite Anzahl der chars die geschrieben werden soll
     * @throws IOException 
     */
   @Override
   public void write(String str, int startPosition, int charactersToWrite) throws IOException {
       byte[] charToByte = new byte[charactersToWrite];
       for(int i = 0; i < charactersToWrite; i++){
           charToByte[i] = 
       }
   }
    
}
