import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public abstract class Usuario {
    private String id;
    private String nome;
    private List<IEmprestimo> emprestimos = new ArrayList<IEmprestimo>();
    
}
