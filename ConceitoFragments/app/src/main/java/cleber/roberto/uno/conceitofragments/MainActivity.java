package cleber.roberto.uno.conceitofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import cleber.roberto.uno.conceitofragments.custom.interfaces.ToolBarListner;

public class MainActivity extends FragmentActivity implements ToolbarFragment.ToolbarListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Conceitos que podem ser inseridos no App

        
    }

    @Override
    public void onBttonClick(int tamanhofonte, String texto) {
        TextoFragment fragmento = (TextoFragment) getSupportFragmentManager().findFragmentById(R.id.frgTexto);
        fragmento.trocarPropriedadesDoTexto(tamanhofonte, texto);
    }
}