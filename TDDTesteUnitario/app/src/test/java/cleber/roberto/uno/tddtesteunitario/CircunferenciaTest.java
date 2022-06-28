package cleber.roberto.uno.tddtesteunitario;


import org.junit.AfterClass;
import org.junit.Test;


public class CircunferenciaTest {


    @AfterClass
    public static void afterClass() throws Exception {

    }

    @Test
    public void deveriaeuUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidas(){

        CircunferenciaTest circunferencia = new CircunferenciaTest();

        double raio = circunferencia.getMedida(-3);

        boolean x = raio > 0;


        AssertTrue(x);




    }

    private double getMedida(double i) {
        return 0;
    }
}