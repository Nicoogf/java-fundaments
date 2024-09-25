
package aleatorio;
import java.util.Random ;

public class Aleatorio {

    
    public static void main(String[] args) {
        int aleatorio = 0 ;
        Random r = new Random();
        aleatorio = (int) (r.nextInt()* 100);
        System.out.println(aleatorio);
        
    }

}
