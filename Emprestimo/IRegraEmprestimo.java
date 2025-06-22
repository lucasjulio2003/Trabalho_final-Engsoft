package Emprestimo;

import Livro.Livro;
import Usuario.Usuario;

public interface IRegraEmprestimo {
    boolean verificarEmprestimo(Usuario usuario, Livro livro);
    int getPrazoEmprestimoDias();
    int getLimiteEmprestimos();

}
