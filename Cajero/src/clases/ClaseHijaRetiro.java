
package clases;


public class ClaseHijaRetiro extends ClasePadre_Abstractas{

    @Override
    public void Transacciones() {
        System.out.print("Cuanto dinero deseas retirar : ");
        Retiro();
        if( withdrawal <= getMoney() ){
            transaction = getMoney() ;
            setMoney(transaction - withdrawal );
            System.out.println("Retiraste : " + withdrawal);
            System.out.println("Tu Saldo Actual es : " +  getMoney());
        }else{
            System.out.println("******************");
            System.out.println("Saldo insuficiente");
            System.out.println("******************");
        }
    }
}
