package Emprestimo;

import Livro.Livro;
import Usuario.Usuario;

public class RegraEmprestimoAlunoGraduacao implements IRegraEmprestimo{


  @Override
    public boolean verificarEmprestimo(Usuario id, Livro codigo) {
        // 1. Verificar se há exemplares disponíveis
    }
}
