/*
    3. Calculadora con Funciones y Métodos:

    * Realiza un programa que permita realizar operaciones básicas (suma, 
      resta, multiplicación y división). Cada operación debe ser implementada 
      mediante funciones o métodos separados.
*/

import java.util.Scanner;

import java.util.Scanner; // Permite leer datos desde el teclado

public class Calculadora {

    // Método que suma dos números
    static float sumar(float a, float b){
        return a + b;
    }

    // Método que resta dos números
    static float restar(float a, float b){
        return a - b;
    }

    // Método que multiplica dos números
    static float multiplicar(float a, float b){
        return a * b;
    }

    // Método que divide dos números
    static float dividir(float a, float b){
        return a / b;
    }

    public static void main(String[] args) {

        // Se crea el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        float num1, num2, resultado; // Números de entrada y resultado
        int opcion;                  // Opción elegida en el menú

        // Bucle que mantiene el programa en ejecución hasta que el usuario elija salir
        do {
            // Muestra el menú
            System.out.println("--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            // Inicializa los números
            num1 = 0;
            num2 = 0;

            // Si la opción es válida, se piden los números
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextFloat();

                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextFloat();
            }

            // Evalúa la opción seleccionada
            switch (opcion) {
                case 1:
                    // Llama al método sumar
                    resultado = sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;

                case 2:
                    // Llama al método restar
                    resultado = restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

                case 3:
                    // Llama al método multiplicar
                    resultado = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;

                case 4:
                    // Verifica que no se divida entre cero
                    if (num2 != 0) {
                        resultado = dividir(num1, num2);
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;

                case 5:
                    // Sale del programa
                    System.out.println("Saliendo del programa...");
                    return;

                default:
                    // Opción inválida
                    System.out.println("Opción no válida.");
            }

            // Salto de línea para separar operaciones
            System.out.println();

        } while (true); // El bucle se repite indefinidamente hasta que el usuario elija salir
    }
}
