
package threadparametros;


public class ThreadParametros {

   
    public static void main(String[] args) {
        Proceso hilo_uno = new Proceso(" Hilo uno ") ;
        Proceso hilo_dos = new Proceso(" Hilo dos" ) ;
        Proceso hilo_tres = new Proceso(" Hilo Tres ") ;
        
        hilo_uno.ValorDeLaCondicion(5);
        hilo_dos.ValorDeLaCondicion(10);
        
        hilo_uno.start() ;
        hilo_dos.start() ;
        hilo_tres.start() ;
        
        
    }

}
