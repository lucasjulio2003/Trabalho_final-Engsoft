package Emprestimo;

import Livro.Livro;
import Usuario.Usuario;

public class RegraEmprestimoProfessor implements IRegraEmprestimo{
   

    @Override
    public boolean verificarEmprestimo(Usuario usuario, Livro livro) {
        System.out.println("Verificando regras de empréstimo específicas para Professor...");
        return false;
    }


}
