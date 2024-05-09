public class Main {
    public static void main(String[] args) {
        Brinquedo br = new Brinquedo();
        br.Inserir(1, "Boneca", 12.90);
        br.Deletar();
        br.Atualizar();
        br.Ler();
        System.out.println("--------------------------------------------------------");
        Bolas b = new Bolas();
        b.Atualizar();
        b.Deletar();
        b.Inserir(1, "Capotao", 270.00);
        b.Ler();
    }
}