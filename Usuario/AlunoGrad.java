package Usuario;

import Emprestimo.IRegraEmprestimo;

public class AlunoGrad extends Usuario{
    public static final int LIMITE_EMPRESTIMO = 2;
    public static final int PRAZO_DIAS = 4;
    
    public AlunoGrad(int id, String nome, IRegraEmprestimo regraEmprestimo){
        super(id,nome, regraEmprestimo);
    }

}
