/*
    5. Verificación de Año Bisiesto: 
    
    * Desarrolla un programa que, al introducir una fecha (día, mes y año), 
      determine si el año es bisiesto o no.
*/

import java.util.Scanner; // Permite leer datos desde el teclado

public class Bisiesto {
    public static void main(String[] args) {

        // Se crea el objeto Scanner para capturar la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Declaración de variables para la fecha
        int dia, mes, anio;

        // Solicita al usuario el día
        System.out.print("Ingrese el día: ");
        dia = sc.nextInt();

        // Solicita al usuario el mes
        System.out.print("Ingrese el mes: ");
        mes = sc.nextInt();

        // Solicita al usuario el año
        System.out.print("Ingrese el año: ");
        anio = sc.nextInt();

        // Verifica si el año es bisiesto
        // Un año es bisiesto si:
        // 1. Es divisible entre 400
        // 2. O es divisible entre 4 pero NO entre 100
        if ((anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
