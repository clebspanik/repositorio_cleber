package cleber.roberto.uno.tddtesteunitario.Forma;

    public class Circunferencia extends Forma{

    public static  final int TAMANHO_ARRAY_INFO_CALCULO_AREA = 1;
    public static final int TAMANHO_ARRAY_MAXIMO_INFO_CALCULO_AREA = 1;
    private static final int POSICAO_ZERO = 0;
    private static final int EXPOENTE_2 = 2;

    //public Circunferencia(int numMedidas) { //argumentos retirados

        public Circunferencia() { //argumentos retirados
        super(TAMANHO_ARRAY_MAXIMO_INFO_CALCULO_AREA);
    }

    @Override
    public double area() {
        return 0;
    }

    public int getTamanhoArrayInfoCalculoArea(){
        return TAMANHO_ARRAY_INFO_CALCULO_AREA;
    }
}