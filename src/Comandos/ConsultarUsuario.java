package Comandos;

import Sistema.Repositorio;
import Usuario.Usuario;

public class ConsultarUsuario implements Comando {

    @Override
    public void executar(CarregadorParametros carregadorParametros) {
        System.out.println("Consultando usuário");

        String idUsuario = carregadorParametros.getParametroUm();

        Repositorio repositorio = Repositorio.getRepositorio();
        Usuario usuario = repositorio.buscarUsuarioPorCodigo(idUsuario);

        if (usuario != null) {
            //System.out.println("Usuário encontrado: " + usuario);
            System.out.println(usuario.consultarUsuario());
        } else {
            System.out.println("Usuário não encontrado com o ID: " + idUsuario);
        }
    }

}
