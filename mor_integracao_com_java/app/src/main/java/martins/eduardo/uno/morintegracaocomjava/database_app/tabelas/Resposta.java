package martins.eduardo.uno.morintegracaocomjava.database_app.tabelas;


import androidx.room.Entity;
import androidx.room.Index;

@Entity(tableName = "tbl_alunoProva"
        , indices = {@Index(value = "id", unique = true)})


public class Resposta {

    private String resposta;

    public Resposta() {}

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
