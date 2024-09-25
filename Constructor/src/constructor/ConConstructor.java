
package constructor;
import java.util.Scanner ;


public class ConConstructor {

    public ConConstructor() {
        Scanner input = new Scanner(System.in) ;
        String nombre = "" ;
        
        System.out.println("Cual es tu nombre ?");
        nombre = input.nextLine() ;
        System.out.println("Tu nombre es : " + nombre);
               
    }
}
