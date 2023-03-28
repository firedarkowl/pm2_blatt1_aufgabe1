
package com.mycompany.blatt1;

import java.io.IOException;

/**
 *
 * @author usach
 */
class NumberToLargeException extends IOException {
    
    public NumberToLargeException(){
        super("Die Zahl ist zu groß!");
    }
    
    public NumberToLargeException(String fehlermeldung){
        super(fehlermeldung);
    }
    
}
