package Emprestimo;

import Livro.Livro;
import Sistema.GerenciadorMensagem;
import Usuario.Usuario;

public class RegraEmprestimoProfessor implements IRegraEmprestimo{
   

    @Override
    public boolean verificarEmprestimo(Usuario usuario, Livro livro) {
        if (!livro.temExemplarDisponivel()) {
            GerenciadorMensagem.falhaExemplaresDisponivel(livro);
            return false;
        }

        //Usuario é devedor?
        if (usuario.isDevedor()) { // Assumindo que Usuario tem um método isDevedor()
            GerenciadorMensagem.falhaUSuarioDevedor(usuario);
            return false;
        }
    return true;
    }
}
