package Usuario;

import Emprestimo.RegraEmprestimoAluno;

public class AlunoPosGrad extends Usuario{
    //public static final int LIMITE_EMPRESTIMO = 3;
    //public static final int PRAZO_DIAS = 5;
    
    public AlunoPosGrad(int id, String nome){
        super(id,nome);
        this.regraEmprestimo = new RegraEmprestimoAluno();
    }
    
    public int getLimiteEmprestimos(){
        return 3;
    }
    public int getPrazoDias(){
        return 5;
    }
}
