package Comandos;

import Sistema.Repositorio;
import Usuario.Professor;
import Usuario.Usuario;

public class NotificacoesRecebidas implements Comando {

    @Override
    public void executar(CarregadorParametros carregadorParametros) {
        System.out.println("Exibindo notificações recebidas");
        
        String idUsuario = carregadorParametros.getParametroUm();
        System.out.println("ID do usuário: " + idUsuario);
        
        Repositorio repositorio = Repositorio.getRepositorio();
        Usuario usuario = repositorio.buscarUsuarioPorCodigo(idUsuario);
        Professor professor = (Professor) usuario;
        
        if (usuario != null) {
            System.out.println("Notificações recebidas: " + professor.getNumeroNotificacoes());
            
        } else {
            System.out.println("Usuário não encontrado.");
        }
        
    }
    

}
