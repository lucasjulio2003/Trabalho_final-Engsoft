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


    
}
