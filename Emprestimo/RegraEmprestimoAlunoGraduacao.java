package Usuario;

import Livro.Livro;

public class RegraEmprestimoAlunoGraduacao implements IRegraEmprestimo{

    @Override
    public boolean verificarEmprestimo(Usuario usuario, Livro livro) {
       return null;
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return null;
    }

    @Override
    public int getLimiteEmprestimos() {
      return null;
    }
    
    
}
