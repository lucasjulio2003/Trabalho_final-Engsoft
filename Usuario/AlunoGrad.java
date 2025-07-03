package Usuario;

import Emprestimo.RegraEmprestimoAluno;

public class AlunoGrad extends Usuario{
    public static final int LIMITE_EMPRESTIMO = 2;
    public static final int PRAZO_DIAS = 4;
    
    public AlunoGrad(int id, String nome){
        super(id,nome);
        this.regraEmprestimo = new RegraEmprestimoAluno();
    }

}
