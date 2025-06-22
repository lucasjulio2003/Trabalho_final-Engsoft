package Usuario;

import Emprestimo.IRegraEmprestimo;
import Emprestimo.RegraEmprestimoProfessor;

//essa implementacao da interface observador ainda n é certa, é só pra ter uma opção de caminho
public class Professor extends Usuario  {
    private int notificacaoContador;
     public static final int PRAZO_DIAS = 8;
    public Professor(String id, String nome, IRegraEmprestimo regraEmprestimo) {
        super(id, nome, regraEmprestimo);

    }
    public static int getPrazoDias() {
        return PRAZO_DIAS;
    }

}
