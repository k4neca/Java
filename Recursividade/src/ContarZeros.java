public class ContarZeros {
    public static void main(String[] args) {
        int number = 19990;
        //int number = 131300;
        //int number = 3010101;
        //int number = 1999044000;

        int resultado = contaZeros(number);
        System.out.println("O numero "+number+" tem "+resultado+" zeros.");
    }

    private static int contaZeros(int number) {
        //caso base
        if (number == 0){
            return 0;
        }
        int lastDigit = number % 10;
        if (lastDigit == 0){
            return 1 + contaZeros(number/10);
        }else{
            return contaZeros(number / 10);
        }
    }
}
