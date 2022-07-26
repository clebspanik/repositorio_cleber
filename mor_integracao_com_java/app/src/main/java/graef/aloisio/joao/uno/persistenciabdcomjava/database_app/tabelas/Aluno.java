package graef.aloisio.joao.uno.persistenciabdcomjava.database_app.tabelas;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_aluno", indices = {@Index(value = "id", unique = true)})

public class Aluno {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String nome;
    private String celular;
    private String email;
    private String gitHubUsuario;

    public Aluno() {}

    //Construtor de Cópia
    public Aluno(Aluno tblAluno){
        this.id = tblAluno.getId();
        this.nome = tblAluno.getNome();
        this.celular = tblAluno.getCelular();
        this.email = tblAluno.getEmail();
        this.gitHubUsuario = tblAluno.gitHubUsuario();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String gitHubUsuario() {
        return gitHubUsuario;
    }

    public void gitHubUsuario(String gitHubUsuario) {
        this.gitHubUsuario = gitHubUsuario;
    }
}
