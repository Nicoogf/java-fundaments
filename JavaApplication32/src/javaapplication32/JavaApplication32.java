
package javaapplication32;
import java.util.Scanner ;


public class JavaApplication32 {

  
    public static void main(String[] args) {
        
        try{
            
        int valor1 ,valor2, resultado ;
        
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("Agrega el primer valor ");
        valor1 = input.nextInt() ;
        
        System.out.println("Agrega el segundo valor ");
        valor2 = input.nextInt() ;        
       
        resultado = valor1 / valor2 ;        
        System.out.println("Division : " + resultado);   
        
        }catch( Exception e ) {
          System.out.println("No se pudo resolver ejercicio : " + e);
                  
        }finally{
            System.out.println("Gracias, vuelva pronto");
        }
        
        
        
        
       
    }

}
