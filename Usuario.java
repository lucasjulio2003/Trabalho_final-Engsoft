import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String id;
    private String nome;
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public Usuario(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}


