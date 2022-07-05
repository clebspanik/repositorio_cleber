package cleber.roberto.uno.tddtesteunitario;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cleber.roberto.uno.tddtesteunitario.Forma.Triangulo;


public class TrianguloTest {
    Triangulo triangulo;
    double lado1 = 20;
    double lado2 = 30;
    double lado3 = 20;
    double sl = lado1 + lado2 + lado3;

    @Before
    public void instanciarObjeto(){
        triangulo = new Triangulo();
    }

    @Test
    public void deveriaClacularAreaDoTriangulo(){
        double areaDoTrianguloCakculadaNoPapel = 17.4123;
        double DIFERENCA_ACEITAVEL             = 0.0001;

        //Lados do triângulos
        //CONTINUAR...

    }

    @Test
    public void deveriaTerUmValorDeSomaDasAreasDoTriangulo() {
        double sl = lado1 + lado2 + lado3;


    }

    @Test
    public void deveriaTerOsValoresDaSomaDivididosPorDois(){
        double resultadoDivisao = sl / 2;


    }

    @Test
    public void deveriaCalcularAreaDoPerimetroDoTriangulo(){
        double perimetro = sl *(sl - lado1) * (sl - lado2) * (sl - lado3);

    }


}