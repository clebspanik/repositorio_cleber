package martins.eduardo.uno.morintegracaocomjava.database_app.tabelas;


import androidx.room.Entity;
import androidx.room.Index;

@Entity(tableName = "tbl_Prova"
        , indices = {@Index(value = "id", unique = true)})

public class Prova {
    private int id;
    public String disciplina;


    public Prova() { }

    //Construtor de cópia

    public Prova (Pergunta tbl_Prova) {
        this.id            = tbl_Prova.getId();
        this.disciplina     = tbl_Prova.getDisciplina();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
