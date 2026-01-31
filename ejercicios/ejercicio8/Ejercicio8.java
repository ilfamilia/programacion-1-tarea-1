import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Definiendo las variables

        double[] lista = new double[500];
        int n, i, j;
        double suma = 0 , media, mediana, moda, varianza, desviacion, aux;
        double SumaVarianza;
        int MaxRepeticiones = 0, RepeticionesActuales;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a procesar:");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ":");
            lista[i] = sc.nextDouble();
            suma += lista[i];
        }

        // Calculando la media
        media = suma / n;

        // Ordenamiento (Metodo Burbuja) - Necesario para Mediana y Moda
        for  (i = 0; i < n - 1; i++) {
            for(j = 0; j < n - i - 1; j++) {
                if(lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }

        // Calculando la mediana

        if (n % 2 == 0) {
            mediana = lista[n / 2 - 1] + lista[n / 2];
        }  else {
            mediana = lista[n / 2];
        }

        // Calculando la moda

        moda = lista[0];
        for(i = 0; i < n; i++) {
            RepeticionesActuales = 0;
            for (j = 0; j < n; j++) {
                if (lista[i] == lista[j]) {
                    RepeticionesActuales++;
                }
            }
            if (RepeticionesActuales > MaxRepeticiones) {
                MaxRepeticiones = RepeticionesActuales;
                moda = lista[i];
            }
        }

        // Calculando la desviacion estandar
        SumaVarianza = 0;
        for (i = 0; i < n; i++) {
            SumaVarianza += Math.pow(lista[i] - media, 2);
        }
        varianza = SumaVarianza / n;
        desviacion = Math.sqrt(varianza);

        //Resultados
        System.out.println("Media: " + media);
        System.out.println("Mediana: " + mediana);
        System.out.println("Moda: " + moda);
        System.out.println("Desviación Estándar: " + desviacion);

    }
}
