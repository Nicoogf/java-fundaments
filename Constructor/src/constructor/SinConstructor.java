
package constructor;
import java.util.Scanner ;


public class SinConstructor {
    
    private Scanner input  = new Scanner(System.in) ;
    String nombre = "" ;
    
    public void PedirNombre(){
        System.out.print("Cual es tu nombre? : ");
        nombre = input.nextLine() ;
    }
    
    public void Imprimir() {
        System.out.println("Tu nombre es : " + nombre);
    }

}
