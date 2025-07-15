package Livro;
import Emprestimo.Emprestimo;
import Emprestimo.Reserva;
import Notificacoes.IObserver;
import Notificacoes.ISubject;
import Usuario.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro implements ISubject{
    private String codigo;
    private String titulo;
    private String editora;
    private List<String> autores;
    private String edicao;
    private String anoPublicacao;
    private List<IObserver> observadores = new ArrayList<>();

    private List<ExemplarLivro> exemplares;

    private List<Reserva> reservas;
    
    public Livro(String codigo, String titulo, String editora, List<String> autores, String edicao, String anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
        this.exemplares = new ArrayList<ExemplarLivro>();
        this.reservas = new ArrayList<>();
        
    }

    public String consultarReservas(Usuario usuario){
        StringBuilder sb = new StringBuilder();
        for (Reserva reserva : reservas) {
            if (reserva.getUsuario().equals(usuario)) {
                sb.append(reserva.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public ExemplarLivro buscarExemplarDisponivel() {
    for (ExemplarLivro ex : exemplares) {
        if (ex.getStatus() == ExemplarLivro.Status.DISPONIVEL) {
            return ex;
        }
    }
        return null;
    }

    public boolean temExemplarDisponivel(){
        if(exemplares.isEmpty())
            return false;
        return true;
    }

    public boolean reservasEexemplaresAdequados(Usuario usuario) {
        int qtdExemplaresDisponiveis = exemplares.size();
        int qtdReservas = getReservas().size();
        boolean temReserva = usuarioTemReserva(usuario);
        
        return (qtdReservas < qtdExemplaresDisponiveis || temReserva);
        
    }
    

    public void reservarLivro(LocalDate dataSolicitacao, Usuario usuario, Livro livro) {
        Reserva reserva = new Reserva(dataSolicitacao, usuario, livro);
        livro.adicionarReserva(reserva);
        System.out.println("Reserva realizada com sucesso para o livro: " + livro.getTitulo());
    }

    // public Emprestimo realizarEmprestimoPara(Usuario usuario) {
    //     for (ExemplarLivro ex : exemplares) {
    //         if (ex.getStatus() == ExemplarLivro.Status.DISPONIVEL) {
    //             ex.setStatus(ExemplarLivro.Status.EMPRESTADO);
    //             Emprestimo emprestimo = new Emprestimo(titulo, LocalDate.now(), LocalDate.now().plusDays(14), ex);
    //             emprestimo.setDataEmprestimo(LocalDate.now());
    //             return emprestimo;
    //         }
    //     }
    //     return null; // Nenhum exemplar disponível
    // }

    public void adicionarReserva(Reserva r) {
        reservas.add(r);
        if(reservas.size() >= 2) {
            notificarObservadores();
        }
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
    public void addExemplar(ExemplarLivro novoExemplar){
        exemplares.add(novoExemplar);
    }
    

    @Override
    public void adicionarObservador(IObserver observador) {
        observadores.add(observador);
        System.out.println("Observador adicionado: " + observador);
    }

    @Override
    public void removerObservador(IObserver observador) {
        observadores.remove(observador);
        System.out.println("Observador removido: " + observador);
    }

    @Override
    public void notificarObservadores() {
        for (IObserver observador : observadores) {

            observador.update("O livro " + titulo + " atingiu mais de 2 reservas simultaneas.");
            // Aqui você pode adicionar mais detalhes sobre a notificação, se necessário
        }
        System.out.println("Todos os observadores foram notificados.");
    }
    public String retornaInfoReservas() {
        StringBuilder info = new StringBuilder();
        for (Reserva reserva : reservas) {
            info.append("Usuário: ").append(reserva.getUsuario().getNome());
        }
        return info.toString();
    }
    public String listaExemplares() {
        StringBuilder sb = new StringBuilder();
        for (ExemplarLivro exemplar : exemplares) {
            sb.append("Código: ").append(exemplar.getCodigo()).append(", Status: ").append(exemplar.getStatus()).append("\n");
            if(exemplar.getStatus() == ExemplarLivro.Status.EMPRESTADO) {
                sb.append("Nome usuário: ").append(exemplar.getEmprestimo().getUsuario().getNome()).append(", Data Emprestimo: ")
                        .append(exemplar.getEmprestimo().getDataEmprestimo()).append("\n");
            }
        }
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return "Livro{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", reservas='" + retornaInfoReservas() + '\'' +
                ", exemplares=" + listaExemplares() +
                '}';
    }
}