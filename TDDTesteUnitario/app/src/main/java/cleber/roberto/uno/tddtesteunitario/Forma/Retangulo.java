package cleber.roberto.uno.tddtesteunitario.Forma;

public class Retangulo extends Forma {

    public static  final int BASE = 30;
    public static  final int ALTURA = 20;

    private static final int TAMANHO_ARRAY_INFO_CALCULO_AREARETANGULO = 20;

    public Retangulo(int numMedidas) {
        super(numMedidas);
    }

    public Retangulo() {
        super();
    }

    @Override
    public double area() {
        return 0;
    }
}
