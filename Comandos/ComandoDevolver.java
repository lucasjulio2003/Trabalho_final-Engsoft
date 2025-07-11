package Comandos;

import Sistema.Repositorio;
import Usuario.Usuario;
import Livro.Livro;

public class ComandoDevolver implements Comando {

    @Override
    public void executar(CarregadorParametros carregadorParametros) {
        System.out.println("Executando devolução");

        String idUsuario = carregadorParametros.getParametroUm();
        String idLivro   = carregadorParametros.getParametroDois();

        Repositorio repositorio = Repositorio.getRepositorio();
        Usuario usuario = repositorio.buscarUsuarioPorCodigo(idUsuario);
        Livro livro     = repositorio.buscarLivroPorCodigo(idLivro);

        usuario.realizarDevolucao(livro);
    }
}