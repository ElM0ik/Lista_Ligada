import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        //creación de la lista ligada de articulos
        LinkedList<articulo> listaArticulos = new LinkedList<>();
        Stack<articulo> pilaArticulos = new Stack<>();

        listaArticulos.add(new articulo("Estuche para escalera", 499.99f));
        listaArticulos.add(new articulo("Clavos de hule", 200.00f));
        listaArticulos.add(new articulo("Disco de calibre 50", 450.75f));
        listaArticulos.add(new articulo("Tuerca para clavos", 150.00f));
        listaArticulos.add(new articulo("Soldadura para madera", 400.00f));
        listaArticulos.add(new articulo("Tijeras para cortar vidrio", 100.25f));
        listaArticulos.add(new articulo("Martillo de plastico flexible", 150.50f));
        listaArticulos.add(new articulo("5 kilos de aceite en polvo", 79.95f));
        listaArticulos.add(new articulo("3 metros de cadena perpetua", 500.00f));
        listaArticulos.add(new articulo("10 metros de cable inalambrico", 159.99f));

        //iterador para la lista
        Iterator<articulo> listaIterador = listaArticulos.iterator();
        System.out.println("Mostrando elementos de la lista y agregándolos a la pila:");
        while (listaIterador.hasNext()) {
            articulo art = listaIterador.next();
            System.out.println(art);
            pilaArticulos.push(art);
        }

        //iterador para la pila
        Iterator<articulo> pilaIterador = pilaArticulos.iterator();
        System.out.println("\nMostrando y vaciando la pila:");
        while (pilaIterador.hasNext()) {
            articulo art = pilaIterador.next();
            System.out.println(art);
            pilaIterador.remove();
        }

        //verificación de que la pila está vacía
        if (pilaArticulos.isEmpty()) {
            System.out.println("\nLa pila está vacía.");
        } else {
            System.out.println("\nLa pila no está vacía.");
        }
    }
}
