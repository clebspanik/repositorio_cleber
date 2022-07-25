package martins.eduardo.uno.morintegracaocomjava.database_app.tabelas;


import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


@Entity(tableName = "tbl_aluno"
        , indices = {@Index(value = "id", unique = true)})


public class Aluno {

    @PrimaryKey(autoGenerate = true)

    private int id;
    public String nome, celular, email, githubUsuario;


    public Aluno (){}

    //Construtor de cópia

    public Aluno(Aluno tblAluno) {
        this.id            = tblAluno.getId();
        this.nome          = tblAluno.getNome();
        this.celular       = tblAluno.getCelular();
        this.email         = tblAluno.getCelular();
        this.githubUsuario = tblAluno.getGithubUsuario();
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

    public String getGithubUsuario() {
        return githubUsuario;
    }

    public void setGithubUsuario(String githubUsuario) {
        this.githubUsuario = githubUsuario;
    }
}
