package parcial1;

/*
 * 1. Ejercicio que pida 100 numeros y que al ingresar el numero 99 el programa termine, al terminar debe mostrar los numeros pares ingresados.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create an array of integers (mutable array)
        List<Integer> nums = new ArrayList<Integer>();
        int num = 0;
        // while num is not 99 and the array is not full do the following
        do {
            // ask for a number
            System.out.println("Please type a number:");
            // store the number in the variable num
            num = input.nextInt();
            // only if the number is even add it to the array
            if (num % 2 == 0) {
                nums.add(num);
            }
        } while (num != 99 && nums.size() < 100);
        // print the even numbers in the array
        for (int i = 0; i < nums.size(); i++) {
            // show number by number with ArrayList.get() method
            System.out.println("even number: " + nums.get(i));
        }
    }
}