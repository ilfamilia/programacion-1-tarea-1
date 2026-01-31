/*
    6. Conversor de Temperaturas: 

    * Crea un programa que convierta temperaturas entre Celsius, Fahrenheit y 
      Kelvin. El usuario debe poder elegir la unidad de entrada y la de salida.
*/
import java.util.Scanner;
public class ConversorTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Preparación de entrada/salida
        //    - Creamos el Scanner para leer desde la consola.
        //    - Declaramos variables para la temperatura de entrada/salida,
        //      la unidad de entrada/salida y una variable intermedia en Celsius.

        double tempEntrada;
        double tempSalida;
        double tempBaseCelsius;
        int unidadEntrada;
        int unidadSalida;

        // ------------------------------
        // 2) Interfaz de usuario: Pedimos las unidades y el valor
        //    - Mostramos un menú para seleccionar la unidad de ENTRADA.
        //    - Leemos la unidad de entrada (1: Celsius, 2: Fahrenheit, 3: Kelvin).
        //    - Solicitamos el valor numérico de la temperatura.
        //    - Mostramos un menú para seleccionar la unidad de SALIDA.
        // ------------------------------
        System.out.println("--- Conversor de Temperaturas ---");

        System.out.println("Seleccione la unidad de ENTRADA:");
        System.out.println("1: Celsius, 2: Fahrenheit, 3: Kelvin");
        unidadEntrada = leerEntero(sc);

        System.out.println("Ingrese el valor de la temperatura:");
        tempEntrada = leerDouble(sc);

        System.out.println("Seleccione la unidad de SALIDA:");
        System.out.println("1: Celsius, 2: Fahrenheit, 3: Kelvin");
        unidadSalida = leerEntero(sc);

        // ------------------------------
        // 3) Conversión a unidad base (Celsius)
        //    - Según la unidad de ENTRADA, convertimos el valor a Celsius.
        //    - Si la unidad de entrada no es válida, mostramos mensaje y salimos.
        // ------------------------------
        switch (unidadEntrada) {
            case 1: // Ya es Celsius
                tempBaseCelsius = tempEntrada;
                break;
            case 2: // Fahrenheit a Celsius: (F - 32) * 5/9
                tempBaseCelsius = (tempEntrada - 32.0) * (5.0 / 9.0);
                break;
            case 3: // Kelvin a Celsius: K - 273.15
                tempBaseCelsius = tempEntrada - 273.15;
                break;
            default:
                System.out.println("Unidad de entrada no válida.");
                sc.close();
                return; // terminamos el programa por entrada inválida
        }

        // ------------------------------
        // 4) Conversión desde Celsius a la unidad de SALIDA
        //    - Usamos la temperatura base en Celsius para convertir a:
        //      1) Celsius, 2) Fahrenheit, 3) Kelvin.
        //    - Si la unidad de salida no es válida, mostramos mensaje y salimos.
        // ------------------------------
        switch (unidadSalida) {
            case 1: // A Celsius
                tempSalida = tempBaseCelsius;
                break;
            case 2: // A Fahrenheit: C * 9/5 + 32
                tempSalida = (tempBaseCelsius * (9.0 / 5.0)) + 32.0;
                break;
            case 3: // A Kelvin: C + 273.15
                tempSalida = tempBaseCelsius + 273.15;
                break;
            default:
                System.out.println("Unidad de salida no válida.");
                sc.close();
                return; // terminamos el programa por salida inválida
        }

        // ------------------------------
        // 5) Resultado
        //    - Mostramos el resultado de la conversión con formato.
        // ------------------------------
        System.out.printf("El resultado de la conversión es: %.4f%n", tempSalida);

        sc.close();
    }

    // --------------------------------------------------------------
    // Funciones auxiliares para lectura segura:
    // - leerEntero: intenta leer un entero, reintenta si el usuario ingresa algo inválido.
    // - leerDouble: intenta leer un número real (double), reintenta si es inválido.
    // Estas funciones mejoran la robustez de la entrada por consola.
    // --------------------------------------------------------------
    private static int leerEntero(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.print("Entrada inválida. Ingrese un número entero: ");
                sc.next(); // descartar el token inválido.
            }
        }
    }

    private static double leerDouble(Scanner sc) {
        while (true) {
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.print("Entrada inválida. Ingrese un número real: ");
                sc.next(); // descartar el token inválido
            }
        }

    }
}