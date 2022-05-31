package formacao.desenvolvedores.tecnologia.uno.projetodesoftwareorientadoaobjetos.conceitosintent;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button           btnPergunta;
    private EditText         edtPergunta;
    private TextView         tvRespondaQuestao;
    private TextView         tvAResposta;
    private ImageButton      imbLimparLinhaPergunta;
    private static final int REQUEST_CODE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPergunta                     = findViewById(R.id.btnPergunta);
        edtPergunta                     = findViewById(R.id.edtPergunta);
        tvRespondaQuestao               = findViewById(R.id.tvRespondaQuestao);
        imbLimparLinhaPergunta          = findViewById(R.id.imbLimparLinhaPergunta);

        btnPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtPergunta.getText().toString().isEmpty()){
                    Intent intent = new Intent(MainActivity.this, RespostaActivity.class);

                    String myString = edtPergunta.getText().toString();
                    intent.putExtra("Pergunta", myString);

                    startActivityForResult(intent, REQUEST_CODE);

                } else {
                    Toast.makeText(MainActivity.this, "Por favor insira uma pergunta", Toast.LENGTH_SHORT).show();
                }
            }
        });

        imbLimparLinhaPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == REQUEST_CODE) && (resultCode == RESULT_OK)){

            String perguntaRetornada = data.getExtras().getString("recuperarPergunta");
            String resposta          =  data.getExtras().getString("recuperarResposta");

            if (resposta != null){
                if(!resposta.isEmpty()){
                    tvAResposta.setVisibility(View.VISIBLE);
                    tvRespondaQuestao.setText(resposta);
                }
            }

            }
        }



    }


















