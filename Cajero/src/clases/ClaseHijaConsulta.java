
package clases;


public class ClaseHijaConsulta extends ClasePadre_Abstractas{
    
    @Override
    public void Transacciones(){
        System.out.println("************************************");
        System.out.println("Tu saldo actual es : " + getMoney() );
        System.out.println("************************************");
    }
}
