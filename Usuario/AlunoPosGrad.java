package Usuario;

import Emprestimo.IRegraEmprestimo;

public class AlunoPosGrad extends Usuario{
    public static final int LIMITE_EMPRESTIMO = 3;
    public static final int PRAZO_DIAS = 5;
    
    public AlunoPosGrad(int id, String nome, IRegraEmprestimo regraEmprestimo){
        super(id,nome, regraEmprestimo);
    }
    
}
