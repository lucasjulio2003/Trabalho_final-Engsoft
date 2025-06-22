package Usuario;

import Emprestimo.RegraEmprestimoProfessor;

//essa implementacao da interface observador ainda n é certa, é só pra ter uma opção de caminho
public class Professor extends Usuario  implements LivroObserver{
    public static final int PRAZO_DIAS = 8;
    private int notificacaoContador;
    private RegraEmprestimoProfessor regraEmprestimo; 

    public Professor(String id, String nome) {
        super(id, nome);
        this.regraEmprestimo = new RegraEmprestimoProfessor();
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

    public RegraEmprestimoProfessor getRegraEmprestimo() {
        return regraEmprestimo;
    }

    public void setRegraEmprestimo(RegraEmprestimoProfessor regraEmprestimo) {
        this.regraEmprestimo = regraEmprestimo;
    }
}
