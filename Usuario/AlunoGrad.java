package Usuario;

import Emprestimo.RegraEmprestimoAlunoGraduacao;
import Livro.Livro;

public class AlunoGrad extends Usuario{
    public static final int LIMITE_EMPRESTIMO = 2;
    public static final int PRAZO_DIAS = 1;
    private RegraEmprestimoAlunoGraduacao regraEmprestimo;
    
    public AlunoGrad(String id, String nome){
        super(id,nome);
        this.regraEmprestimo = new RegraEmprestimoAlunoGraduacao();
    }

    
    public boolean podeRealizarEmprestimo(Livro livro) {
        if (regraEmprestimo == null) {
            return false;
        }
        return regraEmprestimo.verificarEmprestimo(this, livro);
    }

    public int getPrazoEmprestimoDias() {
        if (regraEmprestimo == null) {
            return 0; 
        }
        return regraEmprestimo.getPrazoEmprestimoDias();
    }

    public int getLimiteEmprestimos() {
        if (regraEmprestimo == null) {
            return 0;
        }
        return regraEmprestimo.getLimiteEmprestimos();
    }
}
