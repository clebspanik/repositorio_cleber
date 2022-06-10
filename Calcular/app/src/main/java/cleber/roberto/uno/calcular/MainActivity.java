package cleber.roberto.uno.calcular;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String DIVIDIR       = "Dividir";
    public static final String MULTIPLICAR   = "Multiplicar";
    public static final String SOMAR         = "Somar";
    public static final String SUBTRAIR      = "Subtrair";
    public static final String RAIZ          = "Raíz";
    public static final String POTENCIADE10  = "Potência de 10";
    public static final String POTENCIACAO   = "Potenciação";
    public static final String LOGARITMO     = "Logaritmo";

    private Spinner spiOpcoes;
    private EditText edtOperando1, edtOperando2;
    private TextView tvOpcao,tvOperacao, tvResultado;
    private Button btnCalcular;
    private ImageView imgOperacao, imgOperacao2;
    private ImageButton btnLimpar;

    public int ZERO = 0;
    public int DEZ = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){

            actionBar.setTitle("Calcular");

        }

        spiOpcoes = findViewById(R.id.spiOpcoes);
        edtOperando1 = findViewById(R.id.edtOperando1);
        edtOperando2 = findViewById(R.id.edtOperando2);
        tvOpcao = findViewById(R.id.tvOpcao);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcular = findViewById(R.id.btnCalcular);
        imgOperacao = findViewById(R.id.imgOperacao);
        imgOperacao2 = findViewById(R.id.imgOperacao2);
        btnLimpar    = findViewById(R.id.btnLimpar);

        ArrayAdapter<String> adapterOpcoes_Matematicas = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.operacoes_matematicas));
        adapterOpcoes_Matematicas.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));

        spiOpcoes.setAdapter(adapterOpcoes_Matematicas);
        spiOpcoes.setOnItemSelectedListener(this);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pega a opção selecionda no spinner
                String opcaoSelecionada = spiOpcoes.getSelectedItem().toString();
                if (opcaoSelecionada.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, insira um valor!", Toast.LENGTH_SHORT).show();

                } else if (edtOperando1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, insira um valor", Toast.LENGTH_SHORT).show();

                } else if (edtOperando2.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Por favor, insira uma operação", Toast.LENGTH_SHORT).show();
                } else if (opcaoSelecionada.equals(DIVIDIR)) {
                    tvResultado.setText(dividir());

                } else if (opcaoSelecionada.equals(MULTIPLICAR)) {
                    tvResultado.setText(multiplicar());

                } else if (opcaoSelecionada.equals(SOMAR)) {
                    //if(validarTermosVazios()); {
                    tvResultado.setText(somar());
                    //} else {
                    //preencha a parcela
                    //adtOp1.requestFocus();
                } else if (opcaoSelecionada.equals(SUBTRAIR)) {
                    tvResultado.setText(subtrair());

                } else if(opcaoSelecionada.equals(POTENCIACAO)) {
                    tvResultado.setText(potenciacao());

                } else if(opcaoSelecionada.equals(POTENCIADE10)) {
                    tvResultado.setText(potenciaDe10());

                } else if (opcaoSelecionada.equals(RAIZ)) ;
                tvResultado.setText(raiz());

            }

        });


        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtOperando1.setText("");
                edtOperando2.setText("");
                tvResultado.setText("");
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        imgOperacao.setVisibility(View.VISIBLE);

        if (adapterView.getItemAtPosition(i).toString().isEmpty()) {
            imgOperacao.setVisibility(View.INVISIBLE);
            edtOperando1.setHint("Insira o valor");
            edtOperando2.setHint("Insira o valor");
            tvResultado.setHint("Resultado");
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(DIVIDIR)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao,getTheme()));
            edtOperando1.setHint("Dividendo");
            edtOperando2.setHint("Divisor");
            tvResultado.setHint("Resultado");
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(MULTIPLICAR)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica,getTheme()));
            edtOperando1.setHint("Multiplicando");
            edtOperando2.setHint("Multiplicador");
            tvResultado.setHint("Produto");
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(SOMAR)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma,getTheme()));
            edtOperando1.setHint("Parcela");
            edtOperando2.setHint("Parcela");
            tvResultado.setHint("Total");
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(SUBTRAIR)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao,getTheme()));
            edtOperando1.setHint("Minuendo");
            edtOperando2.setHint("Subtrendo");
            tvResultado.setHint("Diferença");
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(RAIZ)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.raiz,getTheme()));
            edtOperando1.setHint("");
            edtOperando2.setHint("");
            tvResultado.setHint("");
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(POTENCIADE10)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.potencia,getTheme()));
            edtOperando1.setHint("");
            edtOperando2.setHint("");
            tvResultado.setHint("");

        }

        else if (adapterView.getItemAtPosition(i).toString().equals(POTENCIACAO)){
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.potenciacao,getTheme()));
            edtOperando1.setHint("");
            edtOperando2.setHint("");
            tvResultado.setHint("");
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){


    }

    private String somar(){

     int n1 = Integer.valueOf(edtOperando1.getText().toString());
     int n2 = Integer.valueOf(edtOperando2.getText().toString());
     int res = n1 + n2;

     String resultado = Integer.toString(res);

     return "O resultado é: " + resultado;

    }

    private String subtrair(){

        int n1 = Integer.valueOf(edtOperando1.getText().toString());
        int n2 = Integer.valueOf(edtOperando2.getText().toString());
        int res = n1 - n2;

        String resultado = Integer.toString(res);

        return "O resultado é: " + resultado;


    }

    private String multiplicar (){

        int n1 = Integer.valueOf(edtOperando1.getText().toString());
        int n2 = Integer.valueOf(edtOperando2.getText().toString());
        int res = n1 * n2;

        String resultado = Integer.toString(res);

        return "O resultado é: " + resultado;

    }

    private String dividir(){

        int n1 = Integer.valueOf(edtOperando1.getText().toString());
        int n2 = Integer.valueOf(edtOperando2.getText().toString());
        int res = n1 / n2;

        String resultado = Integer.toString(res);

        return "O resultado é: " + resultado;
    }


    private String raiz (){

        int n1 = Integer.valueOf(edtOperando1.getText().toString());
        int resultado = (int) Math.sqrt(n1);

        return "O resultado é: " + resultado;


    }

    private String potenciaDe10 (){

        Double n1 = Double.parseDouble(edtOperando1.getText().toString());
        Double res = Math.pow(n1,DEZ);

        return "O resultado da expressão: " + res;


    }

    private String potenciacao () {

        double n1 = Double.valueOf(edtOperando1.getText().toString()).intValue();
        double n2 = Double.valueOf(edtOperando2.getText().toString()).intValue();
        double res = Math.pow(n1, n2);

        String resultado = Double.toString(res);

        return "O resultado da operação matemática é: " + resultado;


    }


}


//Setoncliklistener - chama o método do botão.