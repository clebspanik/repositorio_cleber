package martins.eduardo.uno.morintegracaocomjava.database_app.tabelas;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_Pergunta"
        , indices = {@Index(value = "id", unique = true)})


public class Pergunta {


    private int id;
    public String pergunta;

    public Pergunta() {}

    //Construtor de cópia

    public Pergunta (Pergunta tbl_Pergunta) {
        this.id            = tbl_Pergunta.getId();
        this.pergunta      = tbl_Pergunta.getPergunta();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
}
