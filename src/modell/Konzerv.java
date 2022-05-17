
package modell;

import java.io.File;
import java.time.LocalDate;

/**
 *
 * @author vizsgaszf
 */
public class Konzerv extends Elelmiszer {
    private String leiras;
    File receptAjanlas;
   

    public Konzerv(String leiras, String gyarto, String nev, LocalDate lejaratiDatum) throws LejaratException {
        this(leiras,gyarto,new File("nincs"),nev,lejaratiDatum);
    }
     public Konzerv(String gyarto,String leiras,File receptAjanlas, String nev, LocalDate lejaratiDatum) throws LejaratException {
        super(gyarto, nev, lejaratiDatum);
        this.leiras=leiras;
        this.receptAjanlas=new File("recept.txt");
     
    }
     
     public void receptmutat(){
         if (receptAjanlas.exists()){
             System.out.println("A recept: ");
         }
         
     }
    
    
}
