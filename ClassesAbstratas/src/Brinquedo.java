public class Brinquedo extends Produtos{

    @Override
    public void Atualizar() {
        System.out.println("Atualizando brinquedo!");
    }

    @Override
    public void Inserir(int id, String nome, double preco) {
        super.Inserir(id, nome, preco);
    }

    @Override
    public void Deletar() {
        super.Deletar();
    }

    @Override
    public void Ler() {
        super.Ler();
    }
}
