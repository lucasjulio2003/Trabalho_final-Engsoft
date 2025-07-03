package Usuario;

import Emprestimo.RegraEmprestimoProfessor;

public class Professor extends Usuario  {
    
    public static final int PRAZO_DIAS = 8;
    
    public Professor(int id, String nome) {
        super(id, nome);
        this.regraEmprestimo = new RegraEmprestimoProfessor();
    }

}
