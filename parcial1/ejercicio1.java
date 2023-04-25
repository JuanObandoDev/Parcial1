package parcial1;

/*
 * 1. Ejercicio que pida 100 numeros y que al ingresar el numero 99 el programa termine, al terminar debe mostrar los numeros pares ingresados.
 */

import java.util.Arrays;
import java.util.Scanner;

class ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[100];
        int num = 0;
        int count = 0;
        // 99 is the exit number
        while (num != 99) {
            // if the array is full, exit the loop
            if (count == nums.length) {
                break;
            }
            System.out.println("Please type a number:");
            num = input.nextInt();
            // if the number is even, add it to the array
            if (num % 2 == 0) {
                nums[count] = num;
                count++;
            }
        }
        // remove the zeros from the array
        nums = Arrays.stream(nums).filter(element -> element != 0).toArray();
        for (int i = 0; i < nums.length; i++) {
            // print the even numbers
            System.out.println("even number: " + nums[i]);
        }
    }
}