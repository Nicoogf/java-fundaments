
package decimales;
import java.text.DecimalFormat ;


public class Decimales {

    
    public static void main(String[] args) {
      double numero = 2 ;
      double raiz = Math.sqrt(numero) ;
      System.out.println(raiz);
      
      
      DecimalFormat df = new DecimalFormat("#.00");
      System.out.println(df.format(raiz));
      
      System.out.println(String.format("%.2f", raiz));
        
    }

}
