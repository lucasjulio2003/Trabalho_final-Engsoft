package Sistema;

import Livro.Livro; 

import Usuario.Usuario;

public class GerenciadorMensagem {
    public static void falhaExemplaresDisponivel(Livro livro) {
        System.out.println("Não foi possível realizar o empréstimo: Não há exemplares disponíveis para o livro " + livro + ".");
    }
    public static void falhaUSuarioDevedor(Usuario usuario) {
        System.out.println("Não foi possível realizar o empréstimo: O usuário " + usuario + " possui livros em atraso.");
    }
    public static void falhaExemplarEmprestado(Usuario usuario, Livro livro) {
        System.out.println("Não foi possível realizar o empréstimo: o usuário " 
            + usuario 
            + " já possui um exemplar do livro " 
            + livro 
            + " emprestado.");
    }
    public static void falhaLimiteMax(Usuario usuario, int limite) {
        System.out.println("Não foi possível realizar o empréstimo: O usuário " + usuario + " atingiu o limite máximo (" + usuario.getLimiteEmprestimos() + ") de livros emprestados simultaneamente.");
    }
    public static void falhaReservasEquantidadesDisponiveis(Livro livro){
        int qtdReservas = livro.getReservas().size();
        int qtdExemplaresDisponiveis = livro.getExemplares().size();
        System.out.println("Não foi possível realizar o empréstimo: Há " + qtdReservas + "de reserva(s) e apenas " + qtdExemplaresDisponiveis + " exemplar(es) disponível(is) e você não possui uma reserva prioritária.\""
        );
    }
    public static void falhaEmprestimoAtivo(Usuario usuario) {
        System.out.println("Não foi possível realizar o empréstimo: O usuário " + usuario.getNome() + " possui um empréstimo em andamento de um exemplar desse mesmo livro.");
    }


    public static void sucesso(String mensagem) {
        System.out.println("Emprestimo realizado");
    }
}
