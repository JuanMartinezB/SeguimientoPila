import java.util.Stack;

public class RecursividadPila {

    public static void main(String[] args) {
        // Crear la pila e inicializarla con los valores
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        // Llamar a la función de suma usando Divide y Vencerás
        int resultado = suma(pila);
        System.out.println(resultado);
    }

    // Método que implementa el algoritmo Divide y Vencerás
    public static int suma(Stack<Integer> stack) {
        // Caso base: La pila tiene solo un elemento
        if (stack.size() == 1) {
            return stack.pop();
        }

        // Si la pila está vacía, no hay nada que sumar
        if (stack.isEmpty()) {
            return 0;
        }

        // Dividir la pila en dos partes
        int mid = stack.size() / 2;

        Stack<Integer> izquierda = new Stack<>();
        Stack<Integer> derecha = new Stack<>();

        // Mover la primera mitad 
        for (int i = 0; i < mid; i++) {
            izquierda.push(stack.pop());
        }

        // La segunda mitad queda en la pila original
        derecha.addAll(stack);

        // Recursivamente sumar las dos mitades
        int sumaIzquierda = suma(izquierda);
        int sumaDerecha = suma(derecha);

        // Retornar la suma de ambas mitades
        return sumaIzquierda + sumaDerecha;
    }
}