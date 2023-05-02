package partial2;

/*
 * 2. Write a program that generates 100 random numbers between 1 and 10000 and shows them on the screen with their corresponding binary numbers and validate if they are Fibonacci numbers.
 */

import java.util.Random;

class exercise2 {
    public static void main(String args[]) {
        // create constants
        final int FIBONACCI_SIZE = 100;
        final String HEADER = "|\tPosition\t|  Number\t|  Binary\t|\n|-------------------------------------------------------|";
        final int MAX = 10000;
        final int MIN = 0;

        // create variables and arrays
        Random aleatorio = new Random();
        long[] fibonacci = new long[FIBONACCI_SIZE];
        String[] binary = new String[FIBONACCI_SIZE];

        // fill the fibonacci array with -1
        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i] = -1;
        }

        // fill the fibonacci array with random numbers
        for (int i = 0; i < fibonacci.length; i++) {
            // generate a random number between 0 and 10000
            int randNumber = aleatorio.nextInt(MAX - MIN + 1) + MIN;
            // check if the number is a fibonacci number
            for (int j = 0; fibonacciSequence(j) <= randNumber; j++) {
                // if the number is a fibonacci number, add it to the array
                if (randNumber == fibonacciSequence(j)) {
                    fibonacci[i] = randNumber;
                }
            }
            // if the number is not a fibonacci number, go back one position
            if (fibonacci[i] == -1) {
                i--;
            }
        }
        // print the table
        System.out.println(HEADER);
        // print the fibonacci numbers and their binary numbers
        for (int i = 0; i < fibonacci.length; i++) {
            // convert the fibonacci number to binary
            binary[i] = binaryNumber(fibonacci[i]);
            // print the fibonacci number, its position and its binary number
            System.out.printf("|\t#%d\t\t|  %d\t\t|  %s\n", i + 1, fibonacci[i], binary[i]);
        }
        System.out.println("|-------------------------------------------------------|");
    }

    public static long fibonacciSequence(int number) {
        // if the number is less than or equal to 0, return 0
        if (number <= 0) {
            return 0;
        } else if (number == 1) { // if the number is equal to 1, return 1
            return 1;
        } else { // if the number is greater than 1, return the sum of the previous two numbers
            return fibonacciSequence(number - 1) + fibonacciSequence(number - 2);
        }
    }

    public static String binaryNumber(long num) {
        // create a string to store the binary number
        String binary = "";
        // while number is not 0
        while (num != 0) {
            // add the remainder of the division to the string
            binary += num % 2;
            // divide the number by 2
            num /= 2;
        }
        // return the reversed string because the binary number is backwards
        return reverse(binary);
    }

    public static String reverse(String text) {
        // create a string to store the reversed string
        String reversed = "0";
        // for each character in the string, add it to the reversed string
        for (int i = text.length() - 1; i >= 0; i--) {
            // add the last character of the string to the reversed string
            reversed += text.charAt(i);
        }
        // return the reversed string
        return reversed;
    }
}