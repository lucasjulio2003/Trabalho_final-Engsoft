package Comandos;

import Livro.Livro;
import Sistema.Repositorio;
import Usuario.Professor;
import Usuario.Usuario;

public class RegistraObservador implements Comando{

    @Override
    public void executar(CarregadorParametros carregadorParametros) {
        System.out.println("Registrando observador");

        String idUsuario = carregadorParametros.getParametroUm();
        System.out.println("ID do usuário: " + idUsuario);
        
        Repositorio repositorio = Repositorio.getRepositorio();
        Usuario usuario = repositorio.buscarUsuarioPorCodigo(idUsuario);
        Professor professor = (Professor) usuario;
        Livro livro = repositorio.buscarLivroPorCodigo(carregadorParametros.getParametroDois());
        
        if (usuario != null) {
            livro.adicionarObservador(professor);
            System.out.println("Observador registrado com sucesso.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
    
}
