package Usuario;

import Emprestimo.RegraEmprestimoProfessor;
import Notificacoes.IObserver;

public class Professor extends Usuario  implements IObserver{
    private int numeroNotificacoes;
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

    @Override
    public void update(String mensagem) {
        System.out.println("Notificação para Professor: " + mensagem);
        numeroNotificacoes++;
    }
    public String getNumeroNotificacoes() {
        return Integer.toString(numeroNotificacoes);
    }


}
