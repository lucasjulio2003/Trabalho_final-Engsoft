package Notificacoes;

public interface ISubject {
    void adicionarObservador(IObserver observador);
    void removerObservador(IObserver observador);
    void notificarObservadores();
}
