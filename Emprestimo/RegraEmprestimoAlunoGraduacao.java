package Emprestimo;

import Livro.Livro;
import Usuario.Usuario;

public class RegraEmprestimoAlunoGraduacao implements IRegraEmprestimo{
  public static final int LIMITE_EMPRESTIMO = 2;
  public static final int PRAZO_DIAS = 4;

  @Override
  public int getPrazoEmprestimoDias() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPrazoEmprestimoDias'");
  }

  @Override
  public int getLimiteEmprestimos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLimiteEmprestimos'");
  }

  @Override
  public boolean verificarEmprestimo(Usuario usuario, Livro livro) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'verificarEmprestimo'");
  }
    
}
