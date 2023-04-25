package parcial1;

/*
 * 2. Ejercicio que pida 5 notas para 5 estudiantes, cada estudiante tiene 2 notas, al final debe mostrar el promedio de cada estudiante.
 */

import java.util.Arrays;
import java.util.Scanner;

class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas1 = new double[5];
        double[] notas2 = new double[5];
        double[] promedio = new double[5];

        // recorrido de los 5 estudiantes
        for (int i = 0; i < notas1.length; i++) {
            // recorrido de las 2 notas de cada estudiante
            for (int j = 0; j < 2; j++) {
                System.out.println("Type the note #" + (j + 1) + " to the student #" + (i + 1));
                double nota = input.nextDouble();
                // si la nota esta entre 0 y 5, la agrega al array
                if (nota <= 5 && nota >= 0) {
                    // dependiendo del contador, se agrega la nota al array de notas1 o notas2
                    switch (j) {
                        case 0:
                            notas1[i] = nota;
                            break;
                        case 1:
                            notas2[i] = nota;
                            break;
                    }
                } else {
                    // sino, se resta 1 al contador para que el usuario pueda ingresar la nota de
                    // nuevo
                    System.out.println("enter values between 0 and 5");
                    j--;
                }
            }
        }

        // recorrido de los 5 estudiantes
        for (int i = 0; i < notas1.length; i++) {
            double prom = 0;
            // recorrido de las 2 notas de cada estudiante
            for (int j = 0; j < 2; j++) {
                // dependiendo del contador, se suma la nota 1 o nota 2 al promedio
                switch (j) {
                    case 0:
                        prom += notas1[i];
                        break;
                    case 1:
                        prom += notas2[i];
                        break;
                }
            }
            // se divide el promedio entre 2 y se agrega al array de promedio
            promedio[i] = prom / 2;
        }
        // se imprimen los arrays
        System.out.println(Arrays.toString(notas1));
        System.out.println(Arrays.toString(notas2));
        System.out.println(Arrays.toString(promedio));
    }
}
