package Sistema;

import Livro.Livro; 

import Usuario.Usuario;

public class GerenciadorMensagem {
    public static void falhaExemplares(Livro livro) {
        System.out.println("Não foi possível realizar o empréstimo: Não há exemplares disponíveis para o livro " + livro + ".");
    }
    public static void falhaDevedor(Usuario usuario) {
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
        System.out.println("Não foi possível realizar o empréstimo: O usuário " + usuario + " atingiu o limite máximo de livros (" + limite + ") emprestados simultaneamente.");
    }

    public static void sucesso(String mensagem) {
        System.out.println("Emprestimo realizado");
    }
}
