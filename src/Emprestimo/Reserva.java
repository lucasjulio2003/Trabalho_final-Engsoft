package Emprestimo;

import Livro.Livro;
import Usuario.Usuario;
import java.time.LocalDate;

public class Reserva {
    private LocalDate dataSolicitacao;

    private Usuario usuario;
    private Livro livro;

    public Reserva(LocalDate dataSolicitacao, Usuario usuario, Livro livro) {
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

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "Reserva{" +
                "dataSolicitacao=" + dataSolicitacao +
                ", livro=" + livro.getTitulo() +
                '}';
    }

}
