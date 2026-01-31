/*
    2. Tabla de Multiplicar: 
    
    * Crea un programa que genere la tabla de multiplicar. El usuario podrá 
      definir los rangos de los factores (multiplicando y multiplicador) y 
      presentar el producto.
*/

import java.util.Scanner; // Permite leer datos desde el teclado

public class Tabla {
    public static void main(String[] args) {

        // Se crea el objeto Scanner para capturar la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        int tablaInicio, tablaFin;   // Rango de tablas a generar
        int multInicio, multFin;     // Rango de multiplicadores
        int producto;                // Almacena el resultado de cada multiplicación

        System.out.println("--- RANGO DE TABLAS ---");

        // Solicita la tabla inicial
        System.out.print("Ingrese desde qué tabla iniciar: ");
        tablaInicio = sc.nextInt();

        // Solicita la tabla final
        System.out.print("Ingrese hasta qué tabla llegar: ");
        tablaFin = sc.nextInt();

        System.out.println("--- RANGO DE MULTIPLICADORES ---");

        // Solicita el multiplicador inicial
        System.out.print("Multiplicar desde el número: ");
        multInicio = sc.nextInt();

        // Solicita el multiplicador final
        System.out.print("Multiplicar hasta el número: ");
        multFin = sc.nextInt();

        // Mensaje informativo
        System.out.println("\nGenerando tablas...");
        System.out.println("-----------------------");

        // Bucle externo: recorre cada tabla dentro del rango indicado
        for (int i = tablaInicio; i <= tablaFin; i++) {

            // Encabezado de cada tabla
            System.out.println("TABLA DEL " + i);

            // Bucle interno: recorre los multiplicadores
            for (int j = multInicio; j < multFin; j++) {

                // Calcula el producto
                producto = i * j;

                // Muestra la operación y su resultado
                System.out.println(i + " x " + j + " = " + producto);
            }

            // Separador entre tablas
            System.out.println("-----------------------");
        }
    }
}