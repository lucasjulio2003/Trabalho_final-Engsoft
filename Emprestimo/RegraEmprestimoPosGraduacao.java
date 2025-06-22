package Emprestimo;

import Livro.Livro;
import Usuario.Usuario;

public class RegraEmprestimoPosGraduacao implements IRegraEmprestimo {

    public static final int LIMITE_EMPRESTIMO = 3;
    public static final int PRAZO_DIAS = 5;

    @Override
    public boolean verificarEmprestimo(Usuario usuario, Livro livro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificarEmprestimo'");
    }

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
    

    
}
