package Emprestimo;

import java.util.Date;

import Livro.Livro;
import Usuario.Usuario;

public class Reserva {
    private Date dataSolicitacao;

    private Usuario usuario;
    private Livro livro;

    public Reserva(Date dataSolicitacao, Usuario usuario, Livro livro) {
        this.dataSolicitacao = dataSolicitacao;
        this.usuario = usuario;
        this.livro = livro;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

}
