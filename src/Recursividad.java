
public class Recursividad {

    // Método main para ejecutar el código 
    public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 5};
        int resultado = suma(numeros, 0, numeros.length-1);
        System.out.println(resultado);
    }

    // Método recursivo que aplica la técinca divide y venceras
    private static int suma(int[] numeros, int inicio, int fin) {
        // Caso base, cuando solo hay un elemento en el arreglo
        if (inicio == fin) {
            return numeros[inicio];
        }

        // Encuentra el punto medio
        int medio = (inicio + fin) / 2;

        // Suma la parte izquierda y la parte derecha recursivamente
        int sumaIzquierda = suma(numeros, inicio, medio);
        int sumaDerecha = suma(numeros, medio + 1, fin);

        // Suma los resultados de cada mitad
        return sumaIzquierda + sumaDerecha;
    }
}
