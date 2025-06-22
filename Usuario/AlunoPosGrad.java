package Usuario;

import Emprestimo.RegraEmprestimoAlunoGraduacao;

public class AlunoPosGrad extends Usuario{
    public static final int LIMITE_EMPRESTIMO = 3;
    public static final int PRAZO_DIAS = 5;
    private RegraEmprestimoAlunoGraduacao regraEmprestimo;
    
    public AlunoPosGrad(String id, String nome){
        super(id,nome);
        this.regraEmprestimo = new RegraEmprestimoAlunoGraduacao();
    }

    public static int getLimiteEmprestimo() {
        return LIMITE_EMPRESTIMO;
    }

    public static int getPrazoDias() {
        return PRAZO_DIAS;
    }

    public RegraEmprestimoAlunoGraduacao getRegraEmprestimo() {
        return regraEmprestimo;
    }

    public void setRegraEmprestimo(RegraEmprestimoAlunoGraduacao regraEmprestimo) {
        this.regraEmprestimo = regraEmprestimo;
    }

    
}
