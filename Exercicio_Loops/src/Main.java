import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("\nExercicio de Loops usando metodos\n");

        exercicio1();
        exercicio2();
        exercicio3();
    }
    private static void exercicio1() {
        Scanner scn = new Scanner(System.in);

        int num, par = 0, impar = 0;

        System.out.println("Exercício 1\n");

        do{
            System.out.print("Informe um número: ");
            num = scn.nextInt();
            if(num !=0) {
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }while(num != 0);
        System.out.println("\nTemos "+ par + " números pares e " + impar + " números impares\n");
    }
    private static void exercicio2() {
        Scanner scn = new Scanner(System.in);

        int num = 0, contador = 0, soma = 0;

        System.out.println("\nExercício 2:\n");

        while (num != -1){
            System.out.print("Informe um número: ");
            num = scn.nextInt();
            if(num != -1) {
                soma += num;
                contador++;
            }
        }
        System.out.println("\nForam informados " + contador + " números");
        System.out.println("A soma dos numeros informados = " + soma);
    }
    private static void exercicio3(){
        Scanner scn = new Scanner(System.in);

        double nota, soma = 0, media;

        System.out.println("\nExercício 3:\n");

        for(int i = 1; i <= 3; i++){
            System.out.print("Informe a " +i+ "ª nota: ");
            nota = scn.nextDouble();
            soma += nota;
        }
        media = soma / 3;

        System.out.println("\nA média das notas informadas é " +media);
    }
}