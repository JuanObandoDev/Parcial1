package parcial1;

/*
 * 2. Ejercicio que pida 5 notas para 5 estudiantes, cada estudiante tiene 2 notas, al final debe mostrar el promedio de cada estudiante.
 */

import java.util.Arrays;
import java.util.Scanner;

class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create constant for the number of students
        final int NUM_ESTUDIANTES = 5;
        // create arrays for the notes and the average of each student
        double[] notas1 = new double[NUM_ESTUDIANTES];
        double[] notas2 = new double[NUM_ESTUDIANTES];
        double[] promedio = new double[NUM_ESTUDIANTES];

        // for each student
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            // for each note
            for (int j = 0; j < 2; j++) {
                // ask for the note
                System.out.println("Type the note #" + (j + 1) + " to the student #" + (i + 1));
                // store the note in nota variable
                double nota = input.nextDouble();
                // if the note is between 0 and 5 store it in the array
                if (nota <= 5 && nota >= 0) {
                    switch (j) {
                        // if j is 0 store the note in notas1 array
                        case 0 -> notas1[i] = nota;
                        // if j is 1 store the note in notas2 array
                        case 1 -> notas2[i] = nota;
                    }
                } else { // if the note is not between 0 and 5 send advertisement and repeat the note
                    System.out.println("enter values between 0 and 5");
                    j--;
                }
            }
        }

        // for each student
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            // calculate the average of the notes
            double prom = 0;
            // for each note
            for (int j = 0; j < 2; j++) {
                // add the note to the prom variable
                switch (j) {
                    // if j is 0 add the note in notas1 array
                    case 0 -> prom += notas1[i];
                    // if j is 1 add the note in notas2 array
                    case 1 -> prom += notas2[i];
                }
            }
            // divide the sum of the notes by 2 and store it in the promedio array
            promedio[i] = prom / 2;
        }

        // print the notes and the average of all students
        System.out.println("Notas 1: " + Arrays.toString(notas1));
        System.out.println("Notas 2: " + Arrays.toString(notas2));
        System.out.println("Promedio: " + Arrays.toString(promedio));
    }
}
