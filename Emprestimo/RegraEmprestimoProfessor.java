package Emprestimo;

import Livro.Livro;
import Usuario.Usuario;

public class RegraEmprestimoProfessor implements IRegraEmprestimo{
   

    @Override
    public boolean verificarEmprestimo(Usuario usuario, Livro livro) {
         if (!livro.temExemplarDisponivel()) {
            return GerenciadorMensagem.falha(
                "Não foi possível realizar o empréstimo: não há exemplares disponíveis para o livro "
                + livro.getTitulo() + "."
            );
        }
         if (usuario.isDevedor()) {
            return GerenciadorMensagem.falha(
                "Não foi possível realizar o empréstimo: o usuário ""
                + usuario.getNome() + "" possui livros em atraso."
            );
        }
        return GerenciadorMensagem.sucesso();
    }

}
