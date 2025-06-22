package Emprestimo;

import Livro.Livro;
import Usuario.Usuario;

public class RegraEmprestimoProfessor implements IRegraEmprestimo{
    public static final int PRAZO_DIAS = 8;

    @Override
    public boolean verificarEmprestimo(Usuario usuario, Livro livro) {
        System.out.println("Verificando regras de empréstimo específicas para Professor...");
        return false;
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 8; // Professor: 8 dias 
    }

    @Override
    public int getLimiteEmprestimos() {
        // Professores não têm limite para a quantidade de livros [8].
        // Um valor muito alto ou Integer.MAX_VALUE pode ser usado para representar "sem limite".
        return Integer.MAX_VALUE;
    }

}
