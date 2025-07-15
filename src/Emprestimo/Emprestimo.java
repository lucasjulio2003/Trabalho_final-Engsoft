package Emprestimo;
import Livro.ExemplarLivro;
import Usuario.Usuario;
import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private String tituloLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private ExemplarLivro exemplarLivro;
    private LocalDate dataDevolucaoReal;
    

    public Emprestimo(String tituloLivro, LocalDate dataDevolucao, ExemplarLivro exemplarLivro){
        this.tituloLivro = tituloLivro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataDevolucao;
        this.exemplarLivro = exemplarLivro;
        this.dataDevolucaoReal = null;
    }
    // public static Emprestimo criarNovoEmprestimo(String tituloLivro, ExemplarLivro exemplar) {
    //     Emprestimo emprestimo = new Emprestimo(
    //         tituloLivro, 
    //         LocalDate.now(), 
    //         LocalDate.now().plusDays(14), 
    //         exemplar
    //     );
    //     emprestimo.setDataEmprestimo(LocalDate.now());
    //     return emprestimo;
    // }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }


    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public ExemplarLivro getExemplarLivro() {
        return exemplarLivro;
    }

    public void tornarExemplarDisponivel(){
        this.exemplarLivro.setStatus(ExemplarLivro.Status.DISPONIVEL);
    }

    public String getCodigoExemplar(){
        return this.exemplarLivro.getCodigo();
    }

    public void setExemplarLivro(ExemplarLivro exemplarLivro) {
        this.exemplarLivro = exemplarLivro;
    }
    
    public void registrarDevolucao() {
        this.dataDevolucaoReal = LocalDate.now(); 
    }
    public LocalDate getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }
    public String consultarEmprestimos() {
        return "Emprestimo{" +
               "tituloLivro='" + tituloLivro + '\'' +
               ", dataEmprestimo=" + dataEmprestimo +
               ", dataDevolucao=" + dataDevolucao +
               ", statusEmprestimo= " + (dataDevolucaoReal != null ? "Devolvido" : "Ativo") +
               ", exemplarLivro= " + (exemplarLivro != null ? exemplarLivro.getCodigo() : "N/A") +
                (dataDevolucaoReal != null ? "dataDevolucaoReal= " + dataDevolucaoReal : "") +
               '}';
    }
    //pra debug
    @Override
    public String toString() {
        return "Emprestimo{" +
               "usuario=" + (usuario != null ? usuario.getNome() : "N/A") +
               ", exemplar=" + (exemplarLivro != null ? exemplarLivro.getCodigo() : "N/A") +
               ", dataEmprestimo=" + dataEmprestimo +
               ", dataDevolucaoPrevista=" + dataDevolucao +
               '}';
    }
    public Usuario getUsuario() {
        return usuario;
    }
}
