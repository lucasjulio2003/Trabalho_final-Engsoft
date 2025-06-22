package Usuario;
import java.util.ArrayList;
import java.util.List;

import Emprestimo.Emprestimo;

public abstract class Usuario {
    private String id;
    private String nome;
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public Usuario(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}


