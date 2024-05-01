import java.util.Scanner;
public class Descomposicion {
    static void descomposicion(int n, String combinacion, int ultimo) {
        if (n == 0) {
            System.out.println(combinacion.substring(1)); // Imprimir la combinación sin el primer "+"
            return;
        }

        for (int i = 1; i <= Math.min(n, ultimo); i++) {
            descomposicion(n - i, combinacion + "+" + i, i);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero n: ");
        int n = teclado.nextInt();

        System.out.println(n + " se puede descomponer como: ");
        descomposicion(n, "", n);
    }
}