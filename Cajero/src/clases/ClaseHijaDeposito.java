
package clases;


public class ClaseHijaDeposito extends ClasePadre_Abstractas{

    @Override
    public void Transacciones(){
        System.out.println("Cuanto dinero deseas depositar : ");
        Deposito() ;
        
        transaction = getMoney() ;
        setMoney(transaction + deposit);
        
        System.out.println("*************************************");
        System.out.println("Depositaste : " + deposit);
        System.out.println("Tu saldo actual es : " + getMoney()) ;
        System.out.println("*************************************");    
    }
}
