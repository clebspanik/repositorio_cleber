package cleber.roberto.uno.tddtesteunitario.Forma;

public abstract class Forma {
    private double[] numeroDemedidas;
    private int TAMANHO_MAXIMO = 3;


    public Forma(int numMedidas){
        numeroDemedidas = new double[numMedidas];
    }

    public Forma() {

    }


    public double getMedida(int posicao){

        if(posicao >= 0 && posicao < TAMANHO_MAXIMO){
            return numeroDemedidas[posicao];
        } else
            throw new RuntimeException("Número inválido p/ calculo da área.");

    }

    public void setMedidas(int posicao, double medida){
        numeroDemedidas[posicao] = medida;
    }

    public abstract double area();

}