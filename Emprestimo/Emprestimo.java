package Emprestimo;
import Livro.ExemplarLivro;
import Usuario.Usuario;
import java.sql.Date;

public class Emprestimo {
    private Usuario usuario;
    private String tituloLivro;
    private Date dataEmprestimo;
    private String status;
    private String dataDevolucao;
    private ExemplarLivro exemplarLivro;
    private Date dataDevolucaoReal;
    

    public Emprestimo(String tituloLivro, Date dataEmprestimo, String status, String dataDevolucao, ExemplarLivro exemplarLivro){
        this.tituloLivro = tituloLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.status = status;
        this.dataDevolucao = dataDevolucao;
        this.exemplarLivro = exemplarLivro;
        this.dataDevolucaoReal = null;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public ExemplarLivro getExemplarLivro() {
        return exemplarLivro;
    }

    public void setExemplarLivro(ExemplarLivro exemplarLivro) {
        this.exemplarLivro = exemplarLivro;
    }
     public boolean isAtivo() {
        // Se já devolveu em data real, não está ativo
        if (dataDevolucaoReal != null) {
            return false;
        }
        // Se ultrapassou o prazo, consideramos não mais ativo (e sim devedor)
        return !isDevedor();
    }
    public void registrarDevolucao() {
        this.dataDevolucaoReal = new Date(System.currentTimeMillis());
    }
    public Date getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }
    //pra debug
    @Override
    public String toString() {
        return "Emprestimo{" +
               "usuario=" + (usuario != null ? usuario.getNome() : "N/A") +
               ", exemplar=" + (exemplarLivro != null ? exemplarLivro.getCodigo() : "N/A") +
               ", dataEmprestimo=" + dataEmprestimo +
               ", dataDevolucaoPrevista=" + dataDevolucao +
               ", dataDevolucaoReal=" + (dataDevolucaoReal != null ? dataDevolucaoReal : "PENDENTE") +
               ", ativo=" + isAtivo() +
               '}';
    }
}
