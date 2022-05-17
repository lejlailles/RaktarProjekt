
package modell;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Raktar implements Iterable<Elelmiszer>, Serializable {
    
    private ArrayList<Elelmiszer> elelmiszerek;

    public Raktar() {
        elelmiszerek=new ArrayList<>();
      
    }
    
    public void felvesz(Elelmiszer elelmiszer){
        elelmiszerek.add(elelmiszer);
        
    }

    @Override
    public Iterator<Elelmiszer> iterator() {
        return Collections.unmodifiableList(elelmiszerek).iterator();
    }
    
    
    
    
    
    
}

















