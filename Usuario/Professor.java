package Usuario;

import Emprestimo.IRegraEmprestimo;
import Emprestimo.RegraEmprestimoProfessor;

//essa implementacao da interface observador ainda n é certa, é só pra ter uma opção de caminho
public class Professor extends Usuario  implements LivroObserver{
    private int notificacaoContador;

    public Professor(String id, String nome, IRegraEmprestimo regraEmprestimo) {
        super(id, nome, regraEmprestimo);
        this.notificacaoContador = 0; //da interface livroobservador
    }

    public static int getPrazoDias() {
        return PRAZO_DIAS;
    }

    public int getNotificacaoContador() {
        return notificacaoContador;
    }

    public void setNotificacaoContador(int notificacaoContador) {
        this.notificacaoContador = notificacaoContador;
    }

}
