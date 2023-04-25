package partial2;

import java.util.Random;

public class exercise4 {
    public static void main(String[] args) {
        // create instance of Random class
        Random aleatorio = new Random();
        // create arrays
        String[] fibonacci = new String[100];
        int[] randNumbers = new int[100];
        String[] roman = new String[100];
        // fill fibonacci array with No
        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i] = "No";
        }
        // generate 100 random numbers between 1 and 4000 and add them to the
        // randNumbers array
        for (int i = 0; i < fibonacci.length; i++) {
            // generate random number and add it to the randNumbers array
            randNumbers[i] = aleatorio.nextInt((4000 - 1) + 1) + 1;
            // generate fibonacci sequence until the number is greater than the random
            // number
            for (int j = 0; fibonacciSequence(j) <= randNumbers[i]; j++) {
                // if the random number is equal to the fibonacci number, add "yes" to the
                // fibonacci array
                if (randNumbers[i] == fibonacciSequence(j)) {
                    fibonacci[i] = "Yes";
                }
            }
        }
        for (int i = 0; i < fibonacci.length; i++) {
            // print table header
            System.out.println((i == 0) ? "Position       Number          Roman         Fibonacci?" : "");
            System.out.println((i == 0) ? "-------------------------------------------------------" : "");
            // get roman number from random number
            roman[i] = romanNumber(randNumbers[i]);
            // print table content (position, number, roman number, fibonacci number?)
            System.out.println("/   " + (i + 1) + ".      /   " + randNumbers[i] + "      /   " + roman[i]
                    + "    /   " + fibonacci[i] + " /");
        }
    }

    public static long fibonacciSequence(int number) {
        // if number is less than or equal to 0, return 0
        if (number <= 0) {
            return 0;
        } else if (number == 1) { // if number is equal to 1, return 1
            return 1;
        } else { // if number is greater than 1, return the sum of the previous two numbers
            return fibonacciSequence(number - 1) + fibonacciSequence(number - 2);
        }
    }

    public static String romanNumber(long num) {
        // create variable to store roman number
        String roman = "";
        // create arrays with roman letters and their corresponding numbers
        String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        // iterate over arrays
        for (int i = 0; i < numbers.length; i++) {
            // while number is greater than or equal to the current number in the array
            while (num >= numbers[i]) {
                // add the corresponding letter to the roman number
                roman += letters[i];
                // subtract the current number from the number
                num -= numbers[i];
            }
        }
        // return roman number
        return roman;
    }
}
