import java.util.Scanner;
public class Descomposicion {
    static String descomposicion(int n, String unidad){
        if(n==1){
            return (unidad);
        }
        else{
            if(n!=1){
                System.out.println((n-1)+"+"+unidad);
            }
            return(unidad+"+"+(descomposicion(n-1,unidad)));
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero n: ");

        int n = teclado.nextInt();
        String unidad="1";

        System.out.println(n+" se puede descomponer como: ");
        System.out.println(descomposicion(n,unidad));

    }
}
