package graef.aloisio.joao.uno.persistenciabdcomjava.database_app.tabelas;

import androidx.room.PrimaryKey;

public class Resposta {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String resposta;
    private int perguntaId;

    public Resposta() {}

    //Construtor de Cópia
    public Resposta(Resposta tblResposta){
        this.id = tblResposta.getId();
        this.resposta = tblResposta.getResposta();
        this.perguntaId = tblResposta.getPerguntaId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getPerguntaId() {
        return perguntaId;
    }

    public void setPerguntaId(int perguntaId) {
        this.perguntaId = perguntaId;
    }
}
