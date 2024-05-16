import Classes.ClienteA;
import Classes.ClienteB;
import Classes.ClientePremium;

public class Main {
    public static void main(String[] args) {
        ClienteA clA = new ClienteA();
        System.out.println("Valor da compra do Cliente A: " +clA.calcularCompra());
        System.out.println("Valor a ser pago de imposto pelo Cliente A: " +clA.calculoImposto());
        clA.inserir();
        clA.atualizar();
        clA.apagar();
        clA.ler();
        clA.imprimir();

        System.out.println("---------------------------------------------------");

        ClienteB clB = new ClienteB();
        System.out.println("Valor da compra do Cliente B: " +clB.calcularCompra());
        System.out.println("Valor a ser pago de imposto pelo Cliente B: " +clB.calculoImposto());
        clB.inserir();
        clB.atualizar();
        clB.apagar();
        clB.ler();
        clB.imprimir();

        System.out.println("---------------------------------------------------");
        ClientePremium clPrem = new ClientePremium();
        System.out.println("Valor da compra do Cliente Premium: " +clPrem.calcularCompra());
        System.out.println("Valor a ser pago de imposto pelo Cliente Premium: " +clPrem.calculoImposto());
        clPrem.inserir();
        clPrem.atualizar();
        clPrem.apagar();
        clPrem.ler();
        clPrem.imprimir();
    }
}