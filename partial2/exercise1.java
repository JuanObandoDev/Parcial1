package partial2;

/*
 * 1. Write a program that generates 100 random numbers between 1 and 4000 and shows them on the screen with their corresponding Roman numerals.
 */

import java.util.Random;

class exercise1 {
    public static void main(String args[]) {
        // create arrays
        int[] nums = new int[100];
        String[] roman = new String[100];
        // create instance of Random class
        Random aleatorio = new Random();
        // generate 100 random numbers between 1 and 4000 and show them on the screen
        for (int i = 0; i < nums.length; i++) {
            // print table header
            System.out.println((i == 0) ? "Position       Number          Roman" : "");
            System.out.println((i == 0) ? "------------------------------------" : "");
            // generate random number
            nums[i] = aleatorio.nextInt((4000 - 1) + 1) + 1;
            // get roman number from random number
            roman[i] = romanNumber(nums[i]);
            // print table content (position, number, roman number)
            System.out.println("/   " + (i + 1) + ".     /   " + nums[i] + "    /   " + roman[i] + " /");
        }
    }

    public static String romanNumber(int num) {
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