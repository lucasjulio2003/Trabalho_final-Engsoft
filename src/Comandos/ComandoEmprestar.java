package Comandos;

import Usuario.Usuario;
import Livro.Livro;
import Sistema.Repositorio;

public class ComandoEmprestar implements Comando {

    @Override
    public void executar(CarregadorParametros carregadorParametros) {

        System.out.println("Executando emprestimo");

        String idUsuario = carregadorParametros.getParametroUm();
        String idLivro = carregadorParametros.getParametroDois();

        Repositorio repositorio = Repositorio.getRepositorio();

        Usuario usuario = repositorio.buscarUsuarioPorCodigo(idUsuario);
        Livro livro = repositorio.buscarLivroPorCodigo(idLivro);

        usuario.realizarEmprestimo(livro);
    }

}
