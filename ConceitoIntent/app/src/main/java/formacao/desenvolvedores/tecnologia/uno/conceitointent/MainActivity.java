package formacao.desenvolvedores.tecnologia.uno.conceitointent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import formacao.desenvolvedores.tecnologia.uno.conceitointent.utils.app.UtilsApp;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 5;
    private static final String DOUBLE_QUEBRA_DE_LINHA = "\n\n";
    private Button btnPergunta;
    private TextView tvExibirResposta, tvAnterior;
    private EditText edtPergunta;
    private ImageButton imgBtnLimpar;
    private String pergunta;
    private ActivityResultLauncher<Intent> activityResultLauncher;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();

        if(actionbar != null){

            actionbar.setTitle("Activity de Pergunta");

        }

        btnPergunta      = findViewById(R.id.btnPergunta);
        edtPergunta      = findViewById(R.id.edtPergunta);
        tvExibirResposta = findViewById(R.id.tvExibirResposta);
        tvAnterior       = findViewById(R.id.tvAnterior);// Text View utilizado para exibir a pergunta e reposta efetuada;
        imgBtnLimpar     = findViewById(R.id.imgBtnLimpar);



        tvExibirResposta.setVisibility(View.INVISIBLE);
        tvAnterior.setVisibility(View.INVISIBLE);


        btnPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!edtPergunta.getText().toString().isEmpty()){

                    Intent irresposta = new Intent(MainActivity.this, RespostaActivity.class);

                    pergunta = edtPergunta.getText().toString();
                    irresposta.putExtra("PERGUNTA", pergunta);


                    startActivityForResult(irresposta, REQUEST_CODE);

                } else {

                    OpenActivityForResult();

                    Toast.makeText(MainActivity.this, "Insira uma pergunta.", Toast.LENGTH_SHORT).show();

                }

            }
        });




        imgBtnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtPergunta.setText("");
                tvExibirResposta.setText("");

            }
        });


        UtilsApp utilsApp = new UtilsApp();
        Log.d(TAG,"Valor convertido de tipos primitivos short para int:"
        + utilsApp.convertToInt(5.1987));

        byte b = -27;
        Log.d(TAG,"Valor convertido de tipos primitivos short para int:"
            + utilsApp.convertToInt(b));

        long valorLong = 87262;
        Log.d(TAG,"Valor convertido de tipos primitivos long para int:"
                + utilsApp.convertToInt(valorLong));



    }//fim do onCreate;



    @Override
    protected void onActivityResult(int requestedCode, int resultCode, Intent data){
        super.onActivityResult(requestedCode, resultCode, data);

        if((requestedCode == REQUEST_CODE) && (resultCode == RESULT_OK)){

            String returnString    = data.getExtras().getString("RETURN_DATA");

            if(returnString != null){
                if(!returnString.isEmpty()){

                    String respostaefetuada = "Resposta:  " + returnString;
                    tvExibirResposta.setVisibility(View.VISIBLE);
                    tvExibirResposta.setText(respostaefetuada);

                    String perguntaefetuada = "Pergunta: " + pergunta;
                    tvAnterior.setVisibility(View.VISIBLE);
                    tvAnterior.setText(perguntaefetuada + DOUBLE_QUEBRA_DE_LINHA + respostaefetuada);

                }
            }
        }

    }





    private void OpenActivityForResult(){
        //Instanciar um objeto com construtor "Intent" com dois argumentos - contexo e classe;

      Intent intent = new Intent (MainActivity.this, RespostaActivity.class);
        String myString = edtPergunta.getText().toString();
        intent.putExtra("Pergunta", myString);
        intent.putExtra( "Pergunta", edtPergunta.getText().toString());

        activityResultLauncher.launch(intent);

        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            Intent data = result.getData();
                            tvExibirResposta.setText(data.getExtras().toString());

                        }
                    }
                });



    }


}










//fim MainActivity





/*https://developer.android.com/training/basics/intents/result -> DOCUMENTAÇÃO do APP*/

/*com Bundle:
* Bundle extramain = getIntent().getExtras();



        String resposta;
        String perguntar;



        if(extramain != null){

            resposta = extramain.getString("RESPOSTA");
            perguntar = extramain.getString("PERGUNTAR");

            tvExibirResposta.setText("A resposta é: " + DOUBLE_QUEBRA_DE_LINHA + resposta);
            tvAnterior.setText("Pergunta: " + perguntar + DOUBLE_QUEBRA_DE_LINHA +"Resposta: " + resposta);

        } else {

            resposta = null;

            tvExibirResposta.setVisibility(View.INVISIBLE);
            tvAnterior.setVisibility(View.INVISIBLE);

        }
*
*
*
*
*
* */