public abstract class Produtos {
    private int id;
    private String nome;
    private double preco;

    public void Inserir(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        System.out.println("Id: "+this.id+"\nNome: "+this.nome+"\nPreço: "+this.preco);
    }
    public void Deletar(){
        System.out.println("Deletando o produto...");
    }
    public abstract void Atualizar();

    public void Ler(){
        System.out.println("Lendo produto...");
    }
}
