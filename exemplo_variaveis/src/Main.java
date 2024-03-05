import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{

        System.out.println("Olá, mundo");

        Scanner in = new Scanner(System.in);

        char ch;
        ch = 'x';
        System.out.println("ch contains " + ch);
        ch++;
        System.out.println("ch is now " +ch);
        ch = 98;
        System.out.println("ch is now " + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;

        System.out.println("Valor do tipoByte = " +tipoByte);
        System.out.println("Valor do tipoShort = " +tipoShort);
        System.out.println("Valor do tipoChar = " +tipoChar);
        System.out.println("Valor do tipoFloat = " +tipoFloat);
        System.out.println("Valor do tipoDouble = " +tipoDouble);
        System.out.println("Valor do tipoInt = " +tipoInt);
        System.out.println("Valor do tipoLong = " +tipoLong);
        System.out.println("Valor do tipoBooleano = " +tipoBooleano);

        System.out.println("========================================\n");

        int opcao;

        do {
            System.out.println("*************** Sistema de Cadastro ***************");
            System.out.println("Op. 1: Cadastrar cliente");
            System.out.println("Op. 2: Cadastrar produto");
            System.out.println("Op. 3: Cadastrar vendedor");
            System.out.println("Op. 0: Sair");
            System.out.println("***************************************************\n");

            System.out.print("Digite a opcao: ");
            opcao = in.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida.\n");
                    //cadastrarCliente();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.\n");
                    //cadastrarProduto();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida.\n");
                    //cadastrarVendedor();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida. Saindo...");
                    //sair
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        }while (opcao !=0);

    }
}