package Comandos;

import Livro.Livro;
import Sistema.Repositorio;
import Usuario.Usuario;
import java.time.LocalDate;

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