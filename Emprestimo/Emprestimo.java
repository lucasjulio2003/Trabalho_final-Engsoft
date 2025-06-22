package Emprestimo;
import java.sql.Date;
import Livro.ExemplarLivro;
import Livro.Livro;

public class Emprestimo {
    private String tituloLivro;
    private Date dataEmprestimo;
    private String status;
    private String dataDevolucao;
    private ExemplarLivro exemplarLivro;

    public Emprestimo(String tituloLivro, Date dataEmprestimo, String status, String dataDevolucao, ExemplarLivro exemplarLivro){
        this.tituloLivro = tituloLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.status = status;
        this.dataDevolucao = dataDevolucao;
        this.exemplarLivro = exemplarLivro;
    }

 
}
