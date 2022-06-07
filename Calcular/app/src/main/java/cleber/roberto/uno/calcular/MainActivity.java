package cleber.roberto.uno.calcular;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String DIVIDIR       = "Dividir";
    public static final String MULTIPLICAR   = "Multiplicar";
    public static final String SOMAR         = "Somar";
    public static final String SUBTRAIR      = "Subtrair";
    private Spinner spiOpcoes;
    private EditText edtOperando1, edtOperando2;
    private TextView tvOpcao,tvOperacao, tvResultado;
    private Button btnCalcular;
    private ImageView imgOperacao, imgOperacao2;



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
        tvOpcao = findViewById(R.id.tvOpcao);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcular = findViewById(R.id.btnCalcular);
        imgOperacao = findViewById(R.id.imgOperacao);
        imgOperacao2 = findViewById(R.id.imgOperacao2);

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

                if (opcaoSelecionada == DIVIDIR) {

                }

                else if (opcaoSelecionada == MULTIPLICAR) {

                }

                else if (opcaoSelecionada == SOMAR) {

                }

                else if (opcaoSelecionada == SUBTRAIR) {


            }


            }

        });


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        imgOperacao.setVisibility(View.VISIBLE);

        if (adapterView.getItemAtPosition(i).toString().equals(DIVIDIR)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao,getTheme()));
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(MULTIPLICAR)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica,getTheme()));
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(SOMAR)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma,getTheme()));
        }

        else if (adapterView.getItemAtPosition(i).toString().equals(SUBTRAIR)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao,getTheme()));

        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    private String somar () {
        String resultado = "";
        int 


        return resultado;
        }

    }
}