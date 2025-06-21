import java.sql.Date;

public class Emprestimo {
    private String tituloLivro;
    private Date dataEmprestimo;
    private String status;
    private String dataDevolucao;

    public Emprestimo(String tituloLivro, Date dataEmprestimo, String status, String dataDevolucao){
        this.tituloLivro = tituloLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.status = status;
        this.dataDevolucao = dataDevolucao;
    }
}
