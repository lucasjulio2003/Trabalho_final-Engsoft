package Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Emprestimo.Emprestimo;
import Emprestimo.IRegraEmprestimo;
import Emprestimo.Reserva;
import Livro.Livro;

public abstract class Usuario {
    private String id;
    private String nome;
    private boolean isDevedor;
    
    protected IRegraEmprestimo regraEmprestimo;
    //private List<RegistroEmprestimo> emprestimosRegistrados = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    private List<Emprestimo> emprestimosAtivos = new ArrayList<Emprestimo>();
    
    public Usuario(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public abstract int getLimiteEmprestimos();

    public void realizarEmprestimo(Livro livro){

        if(this.regraEmprestimo.verificarEmprestimo(this, livro)){
            // faz emprestimo
            System.out.println("Fazendo emprestimo");
            return;
        }

        System.out.println("Emprestimo negado");
    }

    public IRegraEmprestimo getRegraEmprestimo(){
        return this.regraEmprestimo;
    }
    
    public boolean isDevedor() {
        LocalDate hoje  = LocalDate.now();
        for(Emprestimo emp : emprestimosAtivos){
            if(emp.getDataDevolucao().isBefore(hoje)){
                return true;
            }
        }
        return false;
    }
    // public boolean temEmprestimoAtivoDe(Livro livro, String status) {
    //     for (Emprestimo emp : emprestimosAtivos) {
    //         if (emp.getStatus().equals(status) && emp.getExemplarLivro().getCodigo().equals(livro.getCodigo())) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public void realizarDevolucao(Livro livro) {
        for (Emprestimo emp : emprestimosAtivos) {
            if (emp.getExemplarLivro().getCodigo().equals(livro.getCodigo())) {
                emprestimosAtivos.remove(emp); 
                emprestimos.add(emp);
                System.out.println("Devolução realizada com sucesso!");
                return;
            }
        }
        System.out.println("Nenhum empréstimo ativo encontrado para o livro: " + livro.getTitulo());
    }

    
    public void reservarLivro(LocalDate dataSolicitacao, Usuario usuario, Livro livro) {
        Reserva reserva = new Reserva(dataSolicitacao, usuario, livro);
        livro.adicionarReserva(reserva);
        System.out.println("Livro reservado: " + livro.getTitulo() + " em " + dataSolicitacao);
    }

    public void setDevedor(boolean isDevedor) {
        this.isDevedor = isDevedor;
        
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public List<Emprestimo> getEmprestimosAtivos() {
        return emprestimosAtivos;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", isDevedor=" + isDevedor +
                ", emprestimos=" + emprestimos +
                '}';
    }
}


