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
            return new Repositorio();
        } else{
            return repositorio;
        }
    }

    public Usuario buscarUsuarioPorCodigo(String codigo){
        for (Usuario usuario: this.usuarios){
            if (usuario.getId() == codigo){
                return usuario;
            }
        }

        return null;
    }

    public Livro buscarLivroPorCodigo(String codigo){
        for (Livro livro: this.livros){
            if (livro.getCodigo() == codigo){
                return livro;
            }
        }

        return null;
    }

}
