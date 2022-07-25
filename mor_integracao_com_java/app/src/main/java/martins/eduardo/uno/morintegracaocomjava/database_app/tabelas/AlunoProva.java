package martins.eduardo.uno.morintegracaocomjava.database_app.tabelas;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_alunoProva"
        , primaryKeys = {"idAluno", "idProva"}
        , indices = {@Index(value = "idAluno"), @Index(value = {"idProva"})}
        , foreignKeys = {@ForeignKey(entity = Aluno.class, parentColumns = "id",
        childColumns = "idAluno", onUpdate = CASCADE, onDelete = CASCADE )
        , @ForeignKey(entity = Prova.class, parentColumns = "id",
           childColumns = "idProva", onUpdate = CASCADE, onDelete = CASCADE)})

public class AlunoProva {


    private int idAluno;
    private int idProva;

    public AlunoProva() { }

    //Construtor de cópia


    public AlunoProva(AlunoProva tbl_alunoProva){
        this.idAluno = tbl_alunoProva.getIdAluno();
        this.idProva = tbl_alunoProva.getIdProva();
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdProva() {
        return idProva;
    }

    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }
}
