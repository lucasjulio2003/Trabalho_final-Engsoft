package Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Emprestimo.Emprestimo;
import Emprestimo.IRegraEmprestimo;
import Emprestimo.Reserva;
import Livro.ExemplarLivro;
import Livro.ExemplarLivro;
import Livro.Livro;
import Notificacoes.IObserver;
import Sistema.Repositorio;

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
    public abstract int getPrazoDias();


    public void realizarEmprestimo(Livro livro) {
        //System.out.println("entrouaqui");
        if (this.regraEmprestimo.verificarEmprestimo(this, livro)) {
            //System.out.println("veio pro if.");
            

            ExemplarLivro exemplarDisponivel = livro.buscarExemplarDisponivel();
            exemplarDisponivel.setStatus(ExemplarLivro.Status.EMPRESTADO);
            Emprestimo emp = new Emprestimo(livro.getTitulo(), LocalDate.now().plusDays(getPrazoDias()), exemplarDisponivel);
            emprestimosAtivos.add(emp);
            System.out.println("Novo empréstimo realizado com sucesso!");                
            }
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

    public void realizarDevolucao(Livro livro) {
        //tirar de emprestimosativos
        for (Emprestimo emp : emprestimosAtivos) {
            if (emp.getCodigoExemplar().equals(livro.getCodigo())) {
                emprestimosAtivos.remove(emp); 
                emp.tornarExemplarDisponivel();
                emprestimos.add(emp);
                emp.registrarDevolucao(); //pega a data
                System.out.println("Devolução realizada com sucesso!");
                return;
            }
        }
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
    
    public String consultarUsuario() {
        for(Emprestimo emp : emprestimosAtivos) {
            System.out.println(emp.consultarEmprestimos());
        }
       Repositorio repo = Repositorio.getRepositorio();
       return repo.obterReservas(this);
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", isDevedor=" + isDevedor +
                ", emprestimos ativos=" + emprestimosAtivos +
                ", emprestimos passados=" + emprestimos +
                '}';
    }
    
}


