package partial2;

/*
 * 3. Carry out a program that generates 100 random numbers and stores them, in addition to generating the corresponding binary number for each number stored, it must be done with the method of successive divisions
 */

import java.util.Random;

class exercise3 {
    public static void main(String args[]) {
        // create arrays
        int[] nums = new int[100];
        String[] binary = new String[100];
        // create instance of Random class
        Random aleatorio = new Random();
        // generate 100 random numbers and show them on the screen
        for (int i = 0; i < nums.length; i++) {
            // print table header
            System.out.println((i == 0) ? "Position       Number          Binary" : "");
            System.out.println((i == 0) ? "------------------------------------" : "");
            // generate random number
            nums[i] = aleatorio.nextInt((10000 - 1) + 1) + 1;
            // get binary number from random number
            binary[i] = binaryNumber(nums[i]);
            // print table content (position, number, binary number)
            System.out.println("/   " + (i + 1) + ".     /   " + nums[i] + "    /   " + binary[i] + " /");
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
