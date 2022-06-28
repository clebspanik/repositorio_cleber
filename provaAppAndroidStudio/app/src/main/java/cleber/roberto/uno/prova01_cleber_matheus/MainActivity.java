package cleber.roberto.uno.prova01_cleber_matheus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //2) Cite pelo menos 3 situações onde a referência “this” pode ser
        //usada. E onde não pode ser usada? (1,00)

        //R: "This" pode ser usado num metodo respondendo
        // se o carro está ligado ou não, ex: "This.ligado = true;".
        // Pode também ser gerado automaticamente numa classe estática: ex: "this.cpf = cpf;".
        //Em outra situação ele pode ser usado como getter que retorna um nome completo: "return
        //this.nome + " " + this.sobrenome;
        //Ele não deve ser utilizado para referenciar ele mesmo causando uma duplicação.


        //3) Quais detalhes importantes podem ser observados na
        //declaração de uma classe Java? (1,00)

        //R: É importante considerar as boas práticas em programação como indentação para favorecer a legibilidade
        // do código, de preferência, criar pastas e subpastas em um diretório de fácil localização e que nomeado corretamente.
        // Observar se a a primeira letra da classe é maiúscula, se a classe possui Nome, bem como
        // modificadores de acesso (public/private) e se a classe possui metodos, construtores e atributos de classe.

        //4) Explique o conceito de escopo presente na linguagem Java.
        //(1,00)

        //R: O escopo pode ser conceituado como função que inicia e finaliza o programa e as próprias
        //funções dentro do mesmo, são utilizadas chaves para identificá-lo.


        //5) Como funciona a sobrecarga (overload) de métodos no Java?
        //(1,00)

        //R: Funciona permitindo a classe utilizar mais de um método com o mesmo nome, porém os metodos
        // necessariamente devem possuir argumentos diferentes para funcionar.


        //6) Explique o conceito de cast. Quais os tipos existentes? (1,00)

        //R: Cast é quando converte-se valores de um tipo para outro. Existem dois tipos de conversão
        //as implícitas e as explícitas. As primeiras acontecem quando um valor menor é convertido em um
        //valor maior. As explícitas acontecem utilizando comandos de cast como int, byte, double.


    }
}