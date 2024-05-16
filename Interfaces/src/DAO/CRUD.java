package DAO;

public interface CRUD {
    public abstract void inserir();
    public abstract void atualizar();
    public abstract void apagar();
    public abstract void ler();
    public void selecionar();
    public String imprimir();
}
