/*
    1. Serie Fibonacci: 
    
    * Desarrolla un programa que genere la serie de Fibonacci. El usuario debe 
      poder definir el rango de la serie (número de términos a imprimir).
*/

import java.util.Scanner; // Importa la clase Scanner para leer datos desde teclado

public class Fibonacci {
    public static void main(String[] args) {

        // Crea un objeto Scanner para capturar la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario la cantidad de términos a mostrar
        System.out.print("Ingrese la cantidad de términos de la serie Fibonacci: ");
        int cantidad = sc.nextInt();

        // Verifica que la cantidad sea válida (mayor que cero)
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero");
            return; // Termina el programa si la entrada no es válida
        }

        // Caso especial: si solo se pide 1 término
        if (cantidad == 1) {
            System.out.println("0"); // El primer número de Fibonacci es 0
            return; // Termina el programa
        }

        // Variables que almacenan los dos últimos valores de la serie
        int anterior = 0; // Primer término
        int actual = 1;   // Segundo término

        // Imprime los dos primeros términos
        System.out.print(anterior + " ");
        System.out.print(actual + " ");

        // Bucle que genera los términos restantes desde el tercero
        for (int i = 2; i < cantidad; i++) {

            // Calcula el siguiente término sumando los dos anteriores
            int siguiente = anterior + actual;

            // Imprime el nuevo término
            System.out.print(siguiente + " ");

            // Actualiza los valores para la siguiente iteración
            anterior = actual;
            actual = siguiente;
        }
    }
}