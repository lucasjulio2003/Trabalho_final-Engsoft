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

    private Livro livro;

    public ExemplarLivro(String codigo, Livro livro) {
        this.codigo = codigo;
        this.status = Status.DISPONIVEL;
        this.livro = livro;
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public String getCodigoLivro(){
        return livro.getCodigo();
    }
    
}
