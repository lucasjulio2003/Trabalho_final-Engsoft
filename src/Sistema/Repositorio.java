package Sistema;

import java.util.ArrayList;
import java.util.List;

import Livro.Livro;
import Usuario.Usuario;

public class Repositorio {
    private List<Usuario> usuarios;
    private List<Livro> livros;

    private static Repositorio repositorio;

    private Repositorio(){
        this.usuarios = new ArrayList<Usuario>();
        this.livros = new ArrayList<Livro>();
    }
    
    public static Repositorio getRepositorio(){
    if (repositorio == null){
        repositorio = new Repositorio();  
    }
    return repositorio;
}

    public Usuario buscarUsuarioPorCodigo(String codigo){
        for (Usuario usuario: this.usuarios){
            if (usuario.getId().equals(codigo)){
                //System.out.println("Usuario encontrado: " + usuario.getNome());
                //System.out.println("ID: " + usuario.getId());
                return usuario;
            }
            //System.out.println("Usuario não encontrado com o ID: " + codigo);
        }

        return null;
    }


    public Livro buscarLivroPorCodigo(String codigo){
        for (Livro livro: this.livros){
            if (livro.getCodigo().equals(codigo)){
                return livro;
            }
        }

        return null;
    }
    public void addUsuario(Usuario novoUsuario){
        usuarios.add(novoUsuario);
        //System.out.println("Usuario adicionado: " + novoUsuario.getNome()); 
        //System.out.println("ID: " + novoUsuario.getId());
        //System.out.println(usuarios);
    }
    public void addLivro(Livro novoLivro){
        livros.add(novoLivro);
    }
    @Override
    public String toString() {
        return "Repositorio{" +
                "usuarios=" + usuarios +
                ", livros=" + livros +
                '}';
    }
    public String obterReservas(Usuario usuario){
        StringBuilder sb = new StringBuilder();
        for (Livro livro : livros) {
            sb.append(livro.consultarReservas(usuario));
        }
        return sb.toString();
    }
}
