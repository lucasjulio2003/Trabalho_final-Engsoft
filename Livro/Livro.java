package Livro;
import java.util.List;

public class Livro {
    private int codigo;
    private String titulo;
    private String editora;
    private List<String> autores;
    private String edicao;
    private String anoPublicacao;

    private List<ExemplarLivro> exemplares;


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
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

    
}