package Usuario;

import Emprestimo.RegraEmprestimoProfessor;

//essa implementacao da interface observador ainda n é certa, é só pra ter uma opção de caminho
public class Professor extends Usuario  implements LivroObserver{
    private int notificacaoContador;
    private RegraEmprestimoProfessor regraEmprestimo; 

    public Professor(String id, String nome) {
        super(id, nome);
        this.regraEmprestimo = new RegraEmprestimoProfessor();
        this.notificacaoContador = 0; //da interface livroobservador
    }
}
