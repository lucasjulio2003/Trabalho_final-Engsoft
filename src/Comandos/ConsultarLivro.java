package Comandos;

import Livro.Livro;
import Sistema.Repositorio;

public class ConsultarLivro implements Comando {

    @Override
    public void executar(CarregadorParametros carregadorParametros) {
        System.out.println("Consultando livro");

        String idLivro = carregadorParametros.getParametroUm();

        Repositorio repositorio = Repositorio.getRepositorio();
        Livro livro = repositorio.buscarLivroPorCodigo(idLivro);

        if (livro != null) {
            System.out.println("Livro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado com o ID: " + idLivro);
        }
    }

}
