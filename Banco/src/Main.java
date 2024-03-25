import Classes.Agencia;
import Classes.Cliente;
import Classes.Conta;
import Classes.Investimentos;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Caio");
        cliente1.setIdade(25);
        cliente1.setSexo('M');
        cliente1.setEndereco("Rua B, 352");
        cliente1.setCidade("Sabará");

        System.out.println("\nDados do cliente:");
        System.out.println(cliente1.toString());

        Agencia ag1 = new Agencia();
        ag1.setCodigo(1);
        ag1.setNomeAgencia("Bufunfa");
        ag1.setEndereco("Rua W, 1337");
        ag1.setNomeGerente("Tio Patinhas");
        ag1.setMovimentacao("Investimentos");

        System.out.println("\nDados da agência:");
        System.out.println(ag1.toString());

        Conta contaCorrente1 = new Conta();
        contaCorrente1.setNumero(1);
        contaCorrente1.setSaldo(2000);

        System.out.println("\nDados da conta: ");
        System.out.println(contaCorrente1.toString());

        contaCorrente1.sacar(400);
        System.out.println("\nSaldo após sacar: " +contaCorrente1.getSaldo());

        contaCorrente1.depositar(100);
        System.out.println("Saldo após depositar: " +contaCorrente1.getSaldo());

        Investimentos invest1 = new Investimentos();
        invest1.setAgencia("Bufunfa");
        invest1.setCliente("Caio");
        invest1.setConta(1);
        invest1.setGerente("Tio Patinhas");
        invest1.setSaldo(1700);
        invest1.setInvestimento(200);

        System.out.println("\nDados do investimento: ");
        System.out.println(invest1.toString());

        System.out.println("\nQual será o valor descontado no imposto: " +invest1.impostoInvestimento(0.20));
    }
}