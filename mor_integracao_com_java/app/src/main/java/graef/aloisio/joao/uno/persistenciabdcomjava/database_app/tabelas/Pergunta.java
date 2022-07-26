package graef.aloisio.joao.uno.persistenciabdcomjava.database_app.tabelas;

import androidx.room.PrimaryKey;

public class Pergunta {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String pergunta;
    private int prova_id;

    public Pergunta() {}

    //Construtor de Cópia
    public Pergunta(Pergunta tblPergunta){
        this.id = tblPergunta.getId();
        this.pergunta = tblPergunta.getPergunta();
        this.prova_id = tblPergunta.getProva_id();
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

    public int getProva_id() {
        return prova_id;
    }

    public void setProva_id(int prova_id) {
        this.prova_id = prova_id;
    }
}
