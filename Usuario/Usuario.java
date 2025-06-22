package Usuario;
import java.util.ArrayList;
import java.util.List;

import Emprestimo.Emprestimo;
import Emprestimo.IRegraEmprestimo;

public abstract class Usuario {
    private int id;
    private String nome;
    private IRegraEmprestimo regraEmprestimo;
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public Usuario(int id, String nome, IRegraEmprestimo regraEmprestimo) {
        this.id = id;
        this.nome = nome;
        this.regraEmprestimo = regraEmprestimo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
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

    public void setRegraEmprestimo(IRegraEmprestimo regraEmprestimo) {
        this.regraEmprestimo = regraEmprestimo;
    }
    
}


