package Comandos;

import Livro.Livro;
import Sistema.Repositorio;
import Usuario.Usuario;

public class ComandoEmprestar implements Comando {

    @Override
    public void executar(CarregadorParametros carregadorParametros) {

        System.out.println("Executando emprestimo");

        String idUsuario = carregadorParametros.getParametroUm();
        System.out.println(idUsuario);
        String idLivro = carregadorParametros.getParametroDois();
        System.out.println(idLivro);
        Repositorio repositorio = Repositorio.getRepositorio();
        // System.out.println("Repositorio: " + repositorio);
        Usuario usuario = repositorio.buscarUsuarioPorCodigo(idUsuario);
        Livro livro = repositorio.buscarLivroPorCodigo(idLivro);
        System.out.println("id encontrado");
        System.out.println("Usuario: " + usuario);

        System.out.println("chamando comando realizar emrpestmo");
        usuario.realizarEmprestimo(livro);
        
        
    }

}
