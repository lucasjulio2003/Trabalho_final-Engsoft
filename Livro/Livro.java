package Livro;
import java.util.List;

import Emprestimo.Reserva;
import Usuario.Usuario;

public class Livro {
    private String codigo;
    private String titulo;
    private String editora;
    private List<String> autores;
    private String edicao;
    private String anoPublicacao;

    private List<ExemplarLivro> exemplares;

    private List<Reserva> reservas;
    
    public Livro(String codigo, String titulo, String editora, List<String> autores, String edicao, String anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }

    public boolean temExemplarDisponivel(){
        if(exemplares.isEmpty())
            return false;
        return true;
    }
    public int getQuantidadeExemplaresDisponiveis(){
        return exemplares.size();
    }
    public void adicionarReserva(Reserva r) {
        reservas.add(r);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public List<String> getAutores() {
        return autores;
    }
    public void setAutores(List<String> autores) {
        this.autores = autores;
    }
    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public String getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public List<ExemplarLivro> getExemplares() {
        return exemplares;
    }
    public void setExemplares(List<ExemplarLivro> exemplares) {
        this.exemplares = exemplares;
    }
    public boolean usuarioTemReserva(Usuario usuario){
        for(Reserva res: reservas){
            if(res.getUsuario().equals(usuario)){
                return true;
            }
        }
        return false;
    }
    
}