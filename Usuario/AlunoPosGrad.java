package Usuario;

import Emprestimo.IRegraEmprestimo;

public class AlunoPosGrad extends Usuario{
    
    
    public AlunoPosGrad(String id, String nome, IRegraEmprestimo regraEmprestimo){
        super(id,nome, regraEmprestimo);
    }

    public static int getLimiteEmprestimo() {
        return LIMITE_EMPRESTIMO;
    }

    public static int getPrazoDias() {
        return PRAZO_DIAS;
    }
    
}
