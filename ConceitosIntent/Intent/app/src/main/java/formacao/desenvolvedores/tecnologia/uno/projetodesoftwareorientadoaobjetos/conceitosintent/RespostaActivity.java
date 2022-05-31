package formacao.desenvolvedores.tecnologia.uno.projetodesoftwareorientadoaobjetos.conceitosintent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {
    private ImageButton imbLimparLinhaResposta;
    private TextView    tvExibirResposta;
    private Button      btnResposta;
    private EditText    editTextPersonName;
    public static final int REQUEST_CODE = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        imbLimparLinhaResposta          = findViewById(R.id.btnPergunta);
        tvExibirResposta                = findViewById(R.id.tvRespondaQuestao);
        btnResposta                     = findViewById(R.id.btnResposta);
        editTextPersonName              = findViewById(R.id.edtResposta);

        Bundle extras = getIntent().getExtras();

        String pergunta = "";
        if(extras != null) {
            pergunta = extras.getString("Pergunta");
            tvExibirResposta.setText(pergunta);

            String resposta = extras.getString("Resposta");
            if(resposta != null) {
            if(!resposta.isEmpty()){
                btnResposta.setText(resposta);
            }

            }

        }

        btnResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imbLimparLinhaResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextPersonName.setText("");
            }
        });
    }

    @Override
    public void finish() {
        Intent data = new Intent();

        String returnString = editTextPersonName.getText().toString();
        data.putExtra("returnData", returnString);

        setResult(RESULT_OK, data);
        super.finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:{
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if((requestCode == REQUEST_CODE) && (resultCode == RESULT_OK)) {

            String returnString = data.getExtras().getString("returnData");
            String resposta     = data.getExtras().getString("Resposta");

            if(resposta != null){
                if(!resposta.isEmpty()){
                    editTextPersonName.setText(resposta);
                }
            }

            tvExibirResposta.setText(returnString);
        }
    }
}