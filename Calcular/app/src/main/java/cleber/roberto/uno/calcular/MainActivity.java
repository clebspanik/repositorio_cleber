package cleber.roberto.uno.calcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String DIVISAO       = "Divisão";
    public static final String MULTIPLICAR   = "Multiplicar";
    public static final String SOMAR         = "Somar";
    public static final String SUBTRAIR      = "Subtrair";
    public static final String SOMA          = "Soma";
    public static final String SUBTRAÇÃO     = "Subtração";
    private Spinner spiOpcoes;
    private EditText edtOperando1, edtOperando2;
    private TextView tvOpcao,tvOperacao, tvResultado;
    private Button button;
    private ImageView imgOperacao, imageView, imageView2, imageView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiOpcoes = findViewById(R.id.spiOpcoes);
        edtOperando1 = findViewById(R.id.edtOperando1);
        tvOpcao = findViewById(R.id.tvOpcao);
        tvOperacao = findViewById(R.id.tvOperacao);
        tvResultado = findViewById(R.id.tvResultado);
        button = findViewById(R.id.button);
        imgOperacao = findViewById(R.id.imgOperacao);
        imageView = findViewById(R.id.imageView3);
        imageView2 = findViewById(R.id.imageView2);

        ArrayAdapter<String> adapterOpcoes_Matematicas = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.operacoes_matematicas));
        adapterOpcoes_Matematicas.setDropDownViewResource((android.R.layout.simple_spinner_dropdown_item));

        spiOpcoes.setAdapter(adapterOpcoes_Matematicas);
        spiOpcoes.setOnItemSelectedListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Pega a opção selecionda no spinner
                String opcaoSelecionada = spiOpcoes.getSelectedItem().toString();

                if (opcaoSelecionada == DIVISAO) {

                }

                else if (adapterVie == MULTIPLICAR) {

                }
            }
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}