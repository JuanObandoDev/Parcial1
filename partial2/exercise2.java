package partial2;

/*
 * 2. Write a program that generates 100 random numbers between 1 and 10000 and shows them on the screen with their corresponding binary numbers and validate if they are Fibonacci numbers.
 */

import java.util.Random;

class exercise2 {
    public static void main(String args[]) {
        // create instance of Random class
        Random aleatorio = new Random();
        // create arrays
        long[] fibonacci = new long[100];
        String[] binary = new String[100];
        // fill fibonacci array with -1
        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i] = -1;
        }
        // generate 100 random numbers between 1 and 10000 and add them to the fibonacci
        // array if they are fibonacci numbers
        for (int i = 0; i < fibonacci.length; i++) {
            // generate random number
            int randNumber = aleatorio.nextInt((10000 - 0) + 1) + 0;
            // generate fibonacci sequence until the number is greater than the random
            // number
            for (int j = 0; fibonacciSequence(j) <= randNumber; j++) {
                // if the random number is equal to the fibonacci number, add it to the
                // fibonacci array
                if (randNumber == fibonacciSequence(j)) {
                    fibonacci[i] = randNumber;
                }
            }
            // if the number is not a fibonacci number, go back one position in the array
            // and try again
            if (fibonacci[i] == -1) {
                i--;
            }
        }
        for (int i = 0; i < fibonacci.length; i++) {
            // print table header
            System.out.println((i == 0) ? "Position       Number          Binary" : "");
            System.out.println((i == 0) ? "------------------------------------" : "");
            // get binary number from fibonacci number
            binary[i] = binaryNumber(fibonacci[i]);
            // print table content (position, number, binary number)
            System.out.println("/   " + (i + 1) + ".      /   " + fibonacci[i] + "        /   " + binary[i] + " /");
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

    public static String binaryNumber(long num) {
        // create variable to store binary number
        String binary = "";
        // while number is greater than 0
        while (num != 0) {
            // add the remainder of the division between the number and 2 to the binary
            binary += num % 2;
            // divide the number by 2
            num /= 2;
        }
        // return the reversed binary number (because it is generated backwards)
        return reverse(binary);
    }

    public static String reverse(String text) {
        // create variable to store reversed string
        String reversed = "0";
        // iterate over string backwards
        for (int i = text.length() - 1; i >= 0; i--) {
            // add each character to the reversed string
            reversed += text.charAt(i);
        }
        // return reversed string
        return reversed;
    }
}