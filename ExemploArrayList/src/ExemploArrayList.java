import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ArrayList<Pessoa> agendaPessoas = new ArrayList<Pessoa>();
        int opcao;

        do {
            System.out.println("1 - Cadastrar pessoa na agenda");
            System.out.println("2 - Listar pessoa na agenda");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scn.nextInt();

            if (opcao == 1){
                cadastrar(agendaPessoas);
            } else if (opcao == 2) {
                listar(agendaPessoas);
            } else if (opcao == 0) {
                //Sair
            }else {
                System.out.println("Opção inválida!\n");
            }

        }while (opcao != 0);

        scn.close();
    }

    private static void listar(ArrayList<Pessoa> agendaPessoas) {
        for (Pessoa obj : agendaPessoas){
            System.out.println(obj.toString());
        }
    }

    private static void cadastrar(ArrayList<Pessoa> agendaPessoas) {
        Scanner scn = new Scanner(System.in);

        String nome = "";
        String endereco = "";
        String telefone = "";

        System.out.print("Informe o nome: ");
        nome= scn.nextLine();

        System.out.print("Informe o endereco: ");
        endereco = scn.nextLine();

        System.out.print("Informe o telefone: ");
        telefone = scn.nextLine();

        Pessoa objPessoa = new Pessoa(nome, endereco, telefone);

        scn.close();
    }
}