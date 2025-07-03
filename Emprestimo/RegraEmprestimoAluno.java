package Emprestimo;

import java.util.List;

import Livro.Livro;
import Usuario.Usuario;

public class RegraEmprestimoAluno implements IRegraEmprestimo{


  @Override
    public boolean verificarEmprestimo(Usuario id, Livro codigo) {
      // A Regra 1 se aplica a Alunos de Graduação e Pós-Graduação.
        // O objeto 'usuario' aqui pode ser um AlunoGraduacao ou AlunoPosGraduacao.
        // As regras de limite virão do próprio objeto usuario (polimorfismo).

        // 1. Houver exemplares disponíveis na biblioteca (Seção 3.1.1, Regra 1, Item 1)
        if (!livro.temExemplarDisponivel()) {
            return ResultadoVerificacao.falha("Não foi possível realizar o empréstimo: Não há exemplares disponíveis para o livro " + livro.getTitulo() + ".");
        }

        // 2. O usuário não estiver “devedor” com livros em atraso (Seção 3.1.1, Regra 1, Item 2)
        if (usuario.isDevedor()) { // Assumindo que Usuario tem um método isDevedor()
            return ResultadoVerificacao.falha("Não foi possível realizar o empréstimo: O usuário " + usuario.getNome() + " possui livros em atraso.");
        }

        // 3. O usuário seguir as regras específicas referentes à quantidade máxima de livros que podem ser emprestados (Tabela 2)
        // O limite é específico do tipo de aluno (graduação ou pós-graduação).
        // Assumindo que `usuario.getEmprestimosCorrentes()` retorna a lista de empréstimos ativos do usuário.
        if (usuario.getEmprestimos().size() >= usuario.getLimiteEmprestimosEmAberto()) {
            return ResultadoVerificacao.falha("Não foi possível realizar o empréstimo: O usuário " + usuario.getNome() + " atingiu o limite máximo de livros (" + usuario.getLimiteEmprestimosEmAberto() + ") emprestados simultaneamente.");
        }

        // 4. O usuário não pode ter nenhum empréstimo em andamento de um exemplar desse mesmo livro.
        for (RegistroEmprestimo emprestimo : usuario.getEmprestimosCorrentes()) {
            if (emprestimo.getLivro().equals(livro)) { // Assumindo que RegistroEmprestimo pode obter o Livro
                return ResultadoVerificacao.falha("Não foi possível realizar o empréstimo: O usuário " + usuario.getNome() + " já possui um exemplar do livro " + livro.getTitulo() + " emprestado.");
            }
        }

        // 5. Lógica de reservas (Seção 3.1.1, Regra 1, Itens 4 e 5)
        // Isso é um pouco mais complexo e depende de como as reservas são gerenciadas.
        List<Reserva> reservasLivro = livro.getReservas(); // Assumindo Livro.getReservas()
        int qtdReservas = reservasLivro.size();
        int qtdExemplaresDisponiveis = livro.getQuantidadeExemplaresDisponiveis(); // Assumindo método em Livro

        boolean usuarioTemReserva = false;
        for (Reserva reserva : reservasLivro) {
            if (reserva.getUsuario().equals(usuario)) { // Assumindo Reserva.getUsuario()
                usuarioTemReserva = true;
                break;
            }
        }

        if (qtdReservas >= qtdExemplaresDisponiveis) {
            // Se a quantidade de reservas for igual ou superior à de exemplares disponíveis,
            // o empréstimo será permitido apenas se uma das reservas for do usuário.
            if (!usuarioTemReserva) {
                return ResultadoVerificacao.falha("Não foi possível realizar o empréstimo: Há mais reservas do que exemplares disponíveis e o usuário " + usuario.getNome() + " não possui uma reserva para este livro.");
            }
        } else {
            // Se a quantidade de reservas existentes do livro for menor do que a quantidade de exemplares disponíveis,
            // desde que o usuário não tenha uma reserva para esse livro.
            // Ou seja, se o usuário tiver uma reserva, ele tem prioridade e pode pegar mesmo se q Reservas < q Exemplares.
            // A regra 4 diz "desde que o usuário não tenha uma reserva".
            // Isso implica que, se ele tiver uma reserva, ele *pode* pegar.
            // Se não tiver reserva, e qtdReservas < qtdExemplaresDisponiveis, ele também pode.
            // A única exceção é se qtdReservas >= qtdExemplaresDisponiveis E ele não tiver reserva.
            // Então, a lógica acima já cobre isso. Se chegamos aqui, ou ele tem reserva, ou não tem e qtdReservas < qtdExemplaresDisponiveis.
        }

        // Se todas as verificações passaram
        return ResultadoVerificacao.sucesso();
    }
}
