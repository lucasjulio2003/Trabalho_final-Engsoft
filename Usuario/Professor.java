package Usuario;

import Emprestimo.RegraEmprestimoProfessor;

public class Professor extends Usuario  {
    
    //public static final int PRAZO_DIAS = 8;
    
    public Professor(String id, String nome) {
        super(id, nome);
        this.regraEmprestimo = new RegraEmprestimoProfessor();
    }
    public int getLimiteEmprestimos(){
        return -1;
    }
    public int getPrazoDias(){
        return 8;
    }

}
