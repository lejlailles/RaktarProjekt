
package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Raktar;



/**
 *
 * @author vizsgaszf
 */
public class Program {
    Raktar raktar=new Raktar();

   
    public static void main(String[] args) {
        try {
            FileOutputStream file=new FileOutputStream("raktar.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}
