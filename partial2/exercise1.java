package partial2;

/*
 * 1. Write a program that generates 100 random numbers between 1 and 4000 and shows them on the screen with their corresponding Roman numerals.
 */

import java.util.Random;

class exercise1 {
    public static void main(String args[]) {
        // create constants for the number of numbers, the minimum number and the
        // maximum number
        final int NUM_COUNT = 100;
        final int MIN_NUM = 1;
        final int MAX_NUM = 4000;
        // create a constant for the header of the table
        final String HEADER = "Position       Number          Roman\n------------------------------------";

        // create arrays for the numbers and the roman numerals
        int[] nums = new int[NUM_COUNT];
        String[] roman = new String[NUM_COUNT];
        // create a random object
        Random aleatorio = new Random();

        // print the header
        System.out.println(HEADER);
        // for each number
        for (int i = 0; i < NUM_COUNT; i++) {
            // generate a random number between 1 and 4000
            nums[i] = aleatorio.nextInt(MAX_NUM - MIN_NUM + 1) + MIN_NUM;
            // store the roman numeral in the roman array
            roman[i] = romanNumber(nums[i]);
            // print the number, the position and the roman numeral
            System.out.printf("    %d           %d            %s", i + 1, nums[i], roman[i] + "\n");
        }
    }

    public static String romanNumber(int num) {
        // create a string for the roman numeral
        String roman = "";
        // create arrays for the letters and the numbers of the roman numerals
        String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        // for each number
        for (int i = 0; i < numbers.length; i++) {
            // while the number is greater than the number of the roman numeral
            while (num >= numbers[i]) {
                // add the roman numeral letter to the roman string
                roman += letters[i];
                // subtract the number of the roman numeral to the number
                num -= numbers[i];
            }
        }
        // return the roman numeral string
        return roman;
    }
}