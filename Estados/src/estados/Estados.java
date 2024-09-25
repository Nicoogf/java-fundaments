package estados;

public class Estados {

    public static void main(String[] args) {
        Hilo_Proceso proceso_uno = new Hilo_Proceso();
        Hilo_Proceso proceso_dos = new Hilo_Proceso();

        proceso_uno.start();
 
        try {
            proceso_uno.sleep(1000);        

        } catch (InterruptedException e) {
            System.out.println("Error hilo 1 " + e);
        }

        proceso_dos.start();
        proceso_dos.start(); 
        
        try {
            proceso_dos.sleep(1000);
        } catch (InterruptedException e) {
             System.out.println("Error hilo 2 " + e);
        }

    }

}
