package Sistema;

import java.util.List;

import Livro.Livro;
import Usuario.Usuario;

public class Repositorio {
    private List<Usuario> usuarios;
    private List<Livro> livros;

    private Repositorio repositorio;

    private Repositorio(){}
    
    public Repositorio getRepositorio(){
        if (this.repositorio == null){
            return new Repositorio();
        } else{
            return this.repositorio;
        }
    }

    public Usuario buscarUsuarioPorCodigo(int codigo){
        for (Usuario usuario: this.usuarios){
            if (usuario.getId() == codigo){
                return usuario;
            }
        }

        return null;
    }

    public Livro buscarLivroPorCodigo(int codigo){
        for (Livro livro: this.livros){
            if (livro.getCodigo() == codigo){
                return livro;
            }
        }

        return null;
    }


}
