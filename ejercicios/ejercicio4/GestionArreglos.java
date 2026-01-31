/*
    4. Gestión de Arreglos: 
    
    * Escribe un programa que guarde 5 valores en un arreglo. El programa debe 
      permitir que el usuario agregue o edite los valores según lo necesite.
*/

import java.util.Scanner; // Permite leer datos desde el teclado

public class GestionArreglos {
    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Se declara un arreglo de 5 posiciones
        int[] arreglo = new int[5];

        // Variables para el menú y la edición del arreglo
        int opcion, posicion, valor;

        // Inicializa todas las posiciones del arreglo en 0
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }

        // Bucle principal que se ejecuta hasta que el usuario decida salir
        do {
            // Muestra el contenido actual del arreglo
            System.out.println("Arreglo actual:");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(i + " = " + arreglo[i]);
            }

            // Menú de opciones
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar valor");
            System.out.println("2. Editar valor");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            // Evalúa la opción elegida
            switch (opcion) {
                case 1:
                    // Agregar un valor en una posición
                    System.out.print("Ingrese la posición (0 a 4): ");
                    posicion = sc.nextInt();

                    System.out.print("Ingrese el valor: ");
                    valor = sc.nextInt();

                    arreglo[posicion] = valor; // Guarda el valor
                    break;

                case 2:
                    // Editar un valor existente
                    System.out.print("Ingrese la posición a editar (0 a 4): ");
                    posicion = sc.nextInt();

                    System.out.print("Ingrese el nuevo valor: ");
                    valor = sc.nextInt();

                    arreglo[posicion] = valor; // Reemplaza el valor
                    break;

                case 3:
                    // Finaliza el programa
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    // Opción inválida
                    System.out.println("Opción inválida");
            }

        } while (true); // El programa se repite hasta que el usuario decida salir
    }
}
