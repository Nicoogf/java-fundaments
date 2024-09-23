
package clases;
import java.util.Scanner ;

public abstract class ClasePadre_Abstractas {
    
  protected int transaction , withdrawal , deposit ;
  private static int money_account ; 
  Scanner input = new Scanner(System.in) ;
  
  public void operations() {
      int flag = 0 ;
      int selection = 0 ;
      
      do{
      
        do{
         System.out.println("Seleccionar una Opcion") ;
         System.out.println(" 1. Consulta de saldo");
         System.out.println(" 2. Retiro de Efectivo") ;
         System.out.println(" 3. Deposito de Efectivo") ;
         System.out.println(" 4. Salir") ;

         selection = input.nextInt() ;

         if( selection  >= 1 && selection <= 4 ){
             flag = 1 ;
         }
         else {
             System.out.println("**********************");
             System.out.println("*Opcion no disponible*");
             System.out.println("**********************");
         }

        }while( flag == 0 );  
        
        if( selection == 1 ){
           ClasePadre_Abstractas operacion = new ClaseHijaConsulta() ;
           operacion.Transacciones();
            
        }else if( selection == 2){
            ClasePadre_Abstractas operacion = new ClaseHijaRetiro() ;
            operacion.Transacciones();            
        
        }else if( selection == 3){
            ClasePadre_Abstractas operacion = new ClaseHijaDeposito();
            operacion.Transacciones();
        
        }else if( selection == 4){
            System.out.println("Aplicacion Cerrada");
            flag = 2 ;
        }
        
      }while( flag != 2 ) ;
    }
  
  //Retiro de dinero 
  public void Retiro() {
      withdrawal = input.nextInt() ;
  }
  
  public void Deposito(){
      deposit = input.nextInt() ;
  }
  
  
  //Metodo Abstracto
  public abstract void Transacciones() ;
  
  //Getter y Setter
  public int getMoney(){
      return money_account ;
  }
  
  public void setMoney( int newAmount ){
      this.money_account = newAmount ;
  }
}