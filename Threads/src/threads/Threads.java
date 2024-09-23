
package threads;


public class Threads {

   
    public static void main(String[] args) {
      
       proceso1 hilo_uno = new proceso1() ;
       proceso1 hilo_tres = new proceso1() ;
       proceso2 hilo_dos = new proceso2() ;
       
       hilo_uno.start();
       hilo_dos.start();
       System.out.println(" ");
       hilo_tres.start();
    }

}
