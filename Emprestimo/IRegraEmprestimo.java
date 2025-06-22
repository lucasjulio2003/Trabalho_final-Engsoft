package Usuario;

import Livro.Livro;

public interface IRegraEmprestimo {
    boolean verificarEmprestimo(Usuario usuario, Livro livro);
    int getPrazoEmprestimoDias();
    int getLimiteEmprestimos();

}
