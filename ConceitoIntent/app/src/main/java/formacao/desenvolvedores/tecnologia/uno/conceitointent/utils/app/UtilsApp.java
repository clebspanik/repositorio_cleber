package formacao.desenvolvedores.tecnologia.uno.conceitointent.utils.app;

public class UtilsApp {//escopo

    //Construtor Vazzio

    public UtilsApp() {
        metodo(5);


    }

    private void metodo(int i) {
        //A variável i tem escopo local de metodo.

    }

    public int convrterToInt(float valorFloat) {
        return (int) valorFloat;


    }

    //converter para tipos primitivos do Java
    public int convertToInt(double valorDouble) {
        return (int) valorDouble;
    }

    public int convertToInt(Byte valorByte) {
        return (int) valorByte;
    }

    public int convertToInt(short valorShort) {
        return (int) valorShort;
    }

    public int convertToInt (long valorLong){
        return (int) valorLong;
    }

}
//Fim UtilsApp



//Primira letra maiúscula no início da classe (convenção).