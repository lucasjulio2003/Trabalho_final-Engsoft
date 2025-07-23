package Emprestimo;

import Livro.Livro;
import Sistema.GerenciadorMensagem;
import Usuario.Usuario;

public class RegraEmprestimoAluno implements IRegraEmprestimo{



  @Override
    public boolean verificarEmprestimo(Usuario usuario, Livro livro) {

        // Tem exemplar?
        if (!livro.temExemplarDisponivel()) {
            GerenciadorMensagem.falhaExemplaresDisponivel(livro);
            return false;
        }

        //Usuario é devedor?
        if (usuario.isDevedor()) { // Assumindo que Usuario tem um método isDevedor()
            GerenciadorMensagem.falhaUSuarioDevedor(usuario);
            return false;
        }

        //limite maximo de emprestimos
        if (usuario.getEmprestimosAtivos().size() >= usuario.getLimiteEmprestimos()) {
            GerenciadorMensagem.falhaLimiteMax(usuario, usuario.getLimiteEmprestimos());
            return false;
        }

        // 4 e 5) Regras de prioridade por reserva:
        // 4) qtdReservas < qtdDisponiveis (ok)  
        // 5) se qtdReservas >= qtdDisponiveis, só permite se o usuário tiver reserva  int qtdReservas = livro.getReservas().size();
        if (!livro.reservasEexemplaresAdequados(usuario)) {
            GerenciadorMensagem.falhaReservasEquantidadesDisponiveis(livro);
            return false;
        }

        // 6) O usuário não pode ter nenhum empréstimo em andamento de um exemplar desse mesmo livro
        for (Emprestimo empAtivo : usuario.getEmprestimosAtivos()) {
            if (empAtivo.getCodigoExemplar().equals(livro.getCodigo())) {
                System.out.println("Empréstimo já existe para este livro.");
                return false;
            }
            }

        // Se passou em todas as etapas, permite o empréstimo
        return true;
    }


}
