package Comandos;

import java.time.LocalDate;
import Sistema.Repositorio;
import Usuario.Usuario;
import Livro.Livro;

public class ComandoReservar implements Comando {

    @Override
    public void executar(CarregadorParametros carregadorParametros) {
        System.out.println("Executando reserva");

        String idUsuario = carregadorParametros.getParametroUm();
        String idLivro   = carregadorParametros.getParametroDois();

        Repositorio repositorio = Repositorio.getRepositorio();
        Usuario usuario = repositorio.buscarUsuarioPorCodigo(idUsuario);
        Livro livro     = repositorio.buscarLivroPorCodigo(idLivro);

        LocalDate dataReserva = LocalDate.now();
        livro.reservarLivro(dataReserva, usuario,livro);
    }
}