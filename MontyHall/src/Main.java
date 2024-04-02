import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rdn = new Random();
        Scanner scn = new Scanner(System.in);

        int portaPremiada, portaVazia, portaEscolhida, portaEscolhidaOriginal;
        String trocar;
        boolean condicao = true;

        System.out.println("\nBem-vindo ao jogo Monty Hall\n");
        System.out.print("[1][2][3]\n\nEscolha uma porta: ");
        portaEscolhida = scn.nextInt();
        portaEscolhidaOriginal = portaEscolhida;
        portaPremiada = rdn.nextInt(3)+1;
        portaVazia = rdn.nextInt(3)+1;
        do {
            portaVazia = rdn.nextInt(3)+1;
        }while (portaVazia == portaEscolhida || portaVazia == portaPremiada);

        System.out.println("\nO aprsentador abriu a porta " +portaVazia+ " que está vazia\n");

        do {
            System.out.print("Você deseja abrir outra porta? ");
            trocar = scn.next();

            if (trocar.equals("s")){
                do {
                    portaEscolhida = rdn.nextInt(3)+1;
                }while (portaEscolhida == portaVazia || portaEscolhida == portaEscolhidaOriginal);

                if (portaEscolhida == portaPremiada){
                    System.out.println("\nParabéns, você ganhou!");
                    condicao = true;
                }else {
                    System.out.println("\nVocê perdeu, a porta premiada era a " +portaPremiada);
                    condicao = true;
                }
            }else if (trocar.equals("n")){
                if (portaEscolhida == portaPremiada){
                    System.out.println("\nParabéns, você ganhou!");
                    condicao = true;
                }else {
                    System.out.println("\nVocê perdeu, a porta premiada era a " +portaPremiada);
                    condicao = true;
                }
            }else {
                System.out.println("\nOpção informada é inválida! Escolha novamente\n");
                condicao = false;
            }
        }while (!condicao);
    }
}