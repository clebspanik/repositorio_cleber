package desenv.ti.conceitosmor.ui;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import desenv.ti.conceitosmor.R;

public class CadastroProvaActivity extends AppCompatActivity {

    private ImageButton imageButtonIdProva;
    private Spinner spinnerIdProva;


    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_prova_activity);

        imageButtonIdProva = findViewById(R.id.imageButtonIdProva);
        spinnerIdProva     = findViewById(R.id.spinnerIdProva);
    }

}
