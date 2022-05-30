package cleber.roberto.uno.conceitofragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class ToolbarFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {
    //ATRIBUTOS DECLARADOS
    private EditText edtTexto;
    private SeekBar skbFormatarTexto;
    private Button btnTexto;
    private ToolbarListener toolbarListener;
    private static int TEXT_SIZE = 10;

    //declaração de interface - metodos e asssinaturas internos

    public interface ToolbarListener{
        public void onBttonClick(int position, String texto);


    }

    public ToolbarFragment() {
        // Required empty public constructor

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View toolBarLayoutinflated = inflater.inflate(R.layout.fragment_toolbar, container, false);

        edtTexto         = toolBarLayoutinflated.findViewById(R.id.edtTexto);
        skbFormatarTexto = toolBarLayoutinflated.findViewById(R.id.skbFormatarTexto);
        btnTexto         = toolBarLayoutinflated.findViewById(R.id.btnTexto);

        btnTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return toolBarLayoutinflated;
    }

    //Substituir pelo metodo pai
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            toolbarListener = (ToolbarListener) context;

        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
            + "Obrigatório emlementar a interface ToolbarListener");
        }

    }

    public void buttonClicked(View view){
        toolbarListener.onBttonClick(TEXT_SIZE, edtTexto.getText().toString());

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}