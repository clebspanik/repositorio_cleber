package cleber.roberto.uno.tddtesteunitario;


import static org.junit.Assert.*;
import static java.lang.Math.PI;

import java.lang.Math;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import cleber.roberto.uno.tddtesteunitario.Forma.Circunferencia;
import cleber.roberto.uno.tddtesteunitario.Forma.Retangulo;


public class RetanguloTest {

    private static Retangulo retangulo = new Retangulo();


    @Test
    public void calcularAreaDoRetangulo(){
        double area_BaseXAltura = 10;
        double DIFERENCA_ACEITAVEL = 0.0001;

        retangulo.setMedidas(0, 5);
        retangulo.setMedidas(1, 2);

        //double baser = retangulo.getMedidas(0);
        //double alturar = retangulo.getMedidas(1);
        double area = retangulo.getMedida(0) * retangulo.getMedida(1);

        assertEquals("A area de um retangulo: " + area_BaseXAltura, area_BaseXAltura,
                area, DIFERENCA_ACEITAVEL);
        /*Double calculoPapel = new Double(area_BaseXAltura);
        boolean x = calculoPapel.equals(new Double(area));
        assertTrue(x);*/

    }

    @Test
    public void calcularPerimetroRetangulo(){
        double perimetro_BaseXAlturaY = 20;
        double DIFERENCA_ACEITAVEL = 0.0001;

        retangulo.setMedidas(0, 2);
        retangulo.setMedidas(1, 5);

        double perimetro = retangulo.area() * 2;

        assertEquals("O perimetro de um retangulo de base 5 e altura 2 é: 20", perimetro_BaseXAlturaY,
                perimetro, DIFERENCA_ACEITAVEL);
    }
}

//Fim escopo;


