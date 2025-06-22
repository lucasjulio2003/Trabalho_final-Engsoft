package Usuario;

import Emprestimo.IRegraEmprestimo;

//essa implementacao da interface observador ainda n é certa, é só pra ter uma opção de caminho
public class Professor extends Usuario  {
    
    public static final int PRAZO_DIAS = 8;
    
    public Professor(String id, String nome, IRegraEmprestimo regraEmprestimo) {
        super(id, nome, regraEmprestimo);

    }

}
