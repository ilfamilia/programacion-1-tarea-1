// Ejercicio 6: Conversor de Temperaturas
// Este programa convierte temperaturas entre Celsius, Fahrenheit y Kelvin

import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempEntrada, tempSalida, tempBase;
        int unidadEntrada, unidadSalida;

        // Menú de entrada
        System.out.println("--- Conversor de Temperaturas ---");
        System.out.print("Unidad ENTRADA (1:C 2:F 3:K): ");
        unidadEntrada = sc.nextInt();

        // Leer temperatura
        System.out.print("Temperatura: ");
        tempEntrada = sc.nextDouble();

        // Menú de salida
        System.out.print("Unidad SALIDA (1:C 2:F 3:K): ");
        unidadSalida = sc.nextInt();

        // Convertir a Celsius
        if (unidadEntrada == 1) tempBase = tempEntrada;
        else if (unidadEntrada == 2) tempBase = (tempEntrada - 32) * 5 / 9;
        else if (unidadEntrada == 3) tempBase = tempEntrada - 273.15;
        else { System.out.println("Unidad entrada inválida"); sc.close(); return; }

        // Convertir desde Celsius a la salida
        if (unidadSalida == 1) tempSalida = tempBase;
        else if (unidadSalida == 2) tempSalida = (tempBase * 9 / 5) + 32;
        else if (unidadSalida == 3) tempSalida = tempBase + 273.15;
        else { System.out.println("Unidad salida inválida"); sc.close(); return; }

        System.out.println("Resultado: " + tempSalida);
        sc.close();
    }
}
