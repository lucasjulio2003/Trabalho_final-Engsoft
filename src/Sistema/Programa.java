package Sistema;
import Repositorio;
import Usuario.*;

public class Programa {
    

    public static void main(String[] args) {
        Repositorio repo = repo.getRepositorio();
        Usuario usu = new AlunoGrad('123', 'João da Silva');
        Usuario usu2 = new AlunoPosGrad('456', 'Luiz Fernando Rodrigues');
        Usuario usu3 = new Professor('100', 'Carlos Lucena');
        Usuario usu4 = new AlunoGrad('789', 'Pedro Paulo');

        repo.addUsuario(usu);
        repo.addUsuario(usu2);
        repo.addUsuario(usu3);
        repo.addUsuario(usu4);

        Livro livro1 = new Livro(
            "100",
            "Engenharia de Software",
            "Addison Wesley",
            List.of("Ian Sommerville"),
            "6ª",
            "2000"
        );

        Livro livro2 = new Livro(
            "101",
            "UML - Guia do Usuário",
            "Campus",
            List.of("Grady Booch", "James Rumbaugh", "Ivar Jacobson"),
            "7ª",
            "2000"
        );

        Livro livro3 = new Livro(
            "200",
            "Code Complete",
            "Microsoft Press",
            List.of("Steve McConnell"),
            "2ª",
            "2014"
        );

        Livro livro4 = new Livro(
            "201",
            "Agile Software Development, Principles, Patterns and Practices",
            "Prentice Hall",
            List.of("Robert Martin"),
            "1ª",
            "2002"
        );

        Livro livro5 = new Livro(
            "300",
            "Refactoring: Improving the Design of Existing Code",
            "Addison Wesley Professional",
            List.of("Martin Fowler"),
            "1ª",
            "1999"
        );

        Livro livro6 = new Livro(
            "301",
            "Software Metrics: A rigorous and Practical Approach",
            "CRC Press",
            List.of("Norman Fenton", "James Bieman"),
            "3ª",
            "2014"
        );

        Livro livro7 = new Livro(
            "400",
            "Design Patterns: Element of Reusable Object-Oriented Software",
            "Addison Wesley Professional",
            List.of("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides"),
            "1ª",
            "1994"
        );

        Livro livro8 = new Livro(
            "401",
            "UML Distilled: A Brief Guide to the Standard Object Modeling Language",
            "Addison Wesley Professional",
            List.of("Martin Fowler"),
            "3ª",
            "2003"
        );
        repo.addLivro(livro1);
        repo.addLivro(livro2);
        repo.addLivro(livro3);
        repo.addLivro(livro4);
        repo.addLivro(livro5);
        repo.addLivro(livro6);
        repo.addLivro(livro7);
        repo.addLivro(livro8);

        ExemplarLivro exemplar1 = new ExemplarLivro("01", livro1);
        ExemplarLivro exemplar2 = new ExemplarLivro("02", livro1);
        livro1.addExemplar(exemplar1);
        livro1.addExemplar(exemplar2);
        ExemplarLivro exemplar3 = new ExemplarLivro("03", livro2);
        livro2.addExemplar(exemplar3);
        ExemplarLivro exemplar4 = new ExemplarLivro("04", livro3);
        livro3.addExemplar(exemplar4);
        ExemplarLivro exemplar5 = new ExemplarLivro("05", livro4);
        livro4.addExemplar(exemplar5);
        ExemplarLivro exemplar6 = new ExemplarLivro("06", livro5);
        ExemplarLivro exemplar7 = new ExemplarLivro("07", livro5);
        livro5.addExemplar(exemplar7);
        livro5.addExemplar(exemplar6);
        ExemplarLivro exemplar8 = new ExemplarLivro("08", livro7);
        ExemplarLivro exemplar9 = new ExemplarLivro("09", livro7);
        livro7.addExemplar(exemplar8);
        livro7.addExemplar(exemplar9);

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        interfaceUsuario.lerComandos();
        
    }

}
