package Livro;

import Emprestimo.Emprestimo;

public class ExemplarLivro {
    private String codigo;
    public enum Status {
        DISPONIVEL,
        EMPRESTADO
    }

    private Status status;

    private Emprestimo emprestimo;

    public ExemplarLivro(String codigo) {
        this.codigo = codigo;
        this.status = Status.DISPONIVEL;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    
    
}
