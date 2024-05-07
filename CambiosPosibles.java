import java.util.ArrayList;
import java.util.List;
public class CambiosPosibles {
    static void cambios_posible(int[] numeros, int n, List<Integer> combinacionActual, List<List<Integer>> resultados) {
        int suma = sumarLista(combinacionActual);

        if (suma == n) {
            List<Integer> combinacionOrdenada = new ArrayList<>(combinacionActual);
            combinacionOrdenada.sort(null); // Ordenar la combinación
            if (!resultados.contains(combinacionOrdenada)) {
                resultados.add(combinacionOrdenada);
            }
            return;
        }

        if (suma >= n) {
            return;
        }

        for (int i = 0; i < numeros.length; i++) {
            combinacionActual.add(numeros[i]);
            cambios_posible(numeros, n, combinacionActual, resultados);
            combinacionActual.remove(combinacionActual.size() - 1);
        }
    }

    static int sumarLista(List<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = {9, 3, 1, 2}; // Vector de números enteros
        int objetivo = 8; // El número al que debe sumar las combinaciones

        List<List<Integer>> resultados = new ArrayList<>();
        cambios_posible(numeros, objetivo, new ArrayList<>(), resultados);

        System.out.println("Las combinaciones que suman " + objetivo + " son:");
        for (List<Integer> combinacion : resultados) {
            System.out.println(combinacion);
        }
    }
}
