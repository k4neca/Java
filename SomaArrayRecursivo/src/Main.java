import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println("Resultado " +somaArray(array, array.size()-1));
    }

    private static int somaArray(ArrayList<Integer> array, int indice){
        if (indice == 0){
            return array.get(0);
        }else {
            return array.get(indice) + somaArray(array, indice-1);
        }
    }
}