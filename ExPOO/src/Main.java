import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setId(1);
        carro1.setFabricante("Volkswagen");
        carro1.setModelo("Santana");
        carro1.setCor("Prata");
        carro1.setAnoFabricacao(1989);
        carro1.setnPlaca("GLK4543");
        carro1.setQtdePortas(2);

        System.out.println("Dados do Carro: ");
        System.out.println("\nId: " +carro1.getId()+
                "\nFabricante: " +carro1.getFabricante()+
                "\nModelo: " +carro1.getModelo()+
                "\nCor: " +carro1.getCor()+
                "\nAno de fabricacao: " +carro1.getAnoFabricacao()+
                "\nPlaca: " +carro1.getnPlaca()+
                "\nQuantidade de portas: " +carro1.getQtdePortas());
    }
        //System.out.println(carro1.toString());
}