package graef.aloisio.joao.uno.persistenciabdcomjava.database_app.tabelas;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


//@Entity(tableName = "tbl_aluno", indices = {@Index(value = "id", unique = true)})
public class AlunoProva {

    @PrimaryKey(autoGenerate = true)
    private int alunoId;

    private int provaId;

    public AlunoProva() {}

    //Construtor de Cópia
    public AlunoProva(AlunoProva tblAlunoProva){
        this.alunoId = tblAlunoProva.getAlunoId();
        this.provaId = tblAlunoProva.getProvaId();
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getProvaId() {
        return provaId;
    }

    public void setProvaId(int provaId) {
        this.provaId = provaId;
    }
}
