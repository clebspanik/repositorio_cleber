package cleber.roberto.uno.tddtesteunitario;

import static org.junit.Assert.*;
import static java.lang.Math.PI;

import java.lang.Math;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import cleber.roberto.uno.tddtesteunitario.Forma.Circunferencia;



public class CircunferenciaTest {
    private static final int POSICAO_ZERO = 0;
    private static final int EXPOENTE_2 = 2;



    private static Circunferencia circunferencia = new Circunferencia();


    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidas(){

        circunferencia.setMedidas(0, 3);

        //Posição ZERO por se tratar de uma circunferência que precisa de apenas uma informação p/ calcular a área

        double raio = circunferencia.getMedida(0);

        boolean x =  raio > 0;

        assertTrue(x);
        //assertEquals(true, raio > 0);
    }

    @Test
    public void deveriaTerUmLimiteDeTamanhoOVetorDeInformacoesDoCalculoDaArea(){
        //boolean tamanhoValido = circunferencia.setMedidas(0, 3) > circunferencia.;
        circunferencia.getTamanhoArrayInfoCalculoArea();
    }


    @Test
    public void deveriaCalcularAreaDaCircunferencia () {

     int PRECISAO_4_CASAS_DECIMAIS = 4;

        /*O calculo de area de uma circunferencia é dao pela formula A = PI * rao ao quadrado */


        /*Valores calculados na unha*/

    double area_raio3 = 28.2743;
    double area_raio4 = 50.2655;
    double area_raio5 = 78.5398;

    //Raio armazenado na estrutura de dados da classe Pai (forma)
        circunferencia.setMedidas(POSICAO_ZERO,3);

        double area = Math.PI * Math.pow(circunferencia.getMedida(POSICAO_ZERO), EXPOENTE_2);
        assertEquals("A área de uma circunferência de raio 3 é 28,2743",
                area_raio3, area, PRECISAO_4_CASAS_DECIMAIS);



    }




} //Fim escopo;