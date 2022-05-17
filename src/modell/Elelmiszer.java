
package modell;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;


class nevComparator implements Comparator <Elelmiszer>{

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
          Collator coll = Collator.getInstance();
        return coll.compare(o1.getNev(), o2.getNev()); 
    }
    
}

class gyartoComparator implements Comparator <Elelmiszer>{

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
          Collator coll = Collator.getInstance();
        return coll.compare(o1.getGyarto(), o2.getGyarto()); 
    }
    
}
public abstract class Elelmiszer {
    private String gyarto;
    private String nev;
    LocalDate lejaratiDatum;

    public Elelmiszer(String gyarto, String nev, LocalDate lejaratiDatum) throws LejaratException {
        this.gyarto = gyarto;
        this.nev = nev;
         if(this.lejaratiDatum.isAfter(LocalDate.now())){
       throw new LejaratException("Lejárt élelmiszer!");
       }
    }

    public Elelmiszer(String gyarto, String nev) throws LejaratException {
        this.gyarto = gyarto;
        this.nev = nev;
        this.lejaratiDatum=LocalDate.now().plusYears(1);
     
    }

    public String getGyarto() {
        return gyarto;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Elelmiszer{" + "gyarto=" + gyarto + ", nev=" + nev + ", lejaratiDatum=" + lejaratiDatum + '}';
    }
    
    
}





