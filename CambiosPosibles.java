import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class CambiosPosibles {
    static void CambiosPosibles(int[] array, int n) {

    }
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del arreglo: ");
        Scanner scanner = new Scanner(System.in);
        int ArraySize = scanner.nextInt();
        int[] Array = new int[ArraySize];

        for(int i = 0; i < ArraySize; i++) {
            System.out.println("Ingrese el valor de la posición " + i + ": ");
            Array[i] = scanner.nextInt();
        }
        System.out.println("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        CambiosPosibles(Array, n);
    }



}
