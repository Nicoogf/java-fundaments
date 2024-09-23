
package cajero;

import clases.ClaseHijaConsulta;
import clases.ClasePadre_Abstractas;


public class Cajero {

    public static void main(String[] args) {
        ClasePadre_Abstractas operador = new ClaseHijaConsulta() ;
        operador.setMoney(500);
        operador.operations() ;
    }

}
