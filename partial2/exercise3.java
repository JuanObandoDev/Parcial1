package partial2;

/*
 * 3. Carry out a program that generates 100 random numbers and stores them, in addition to generating the corresponding binary number for each number stored, it must be done with the method of successive divisions
 */

import java.util.Random;

class exercise3 {
    public static void main(String args[]) {
        final int NUMS_COUNT = 100;
        final String HEADER = "|\tPosition\t|  Number\t|  Binary\t|\n|-------------------------------------------------------|";
        final int MAX = 10000;
        final int MIN = 1;
        // create arrays
        int[] nums = new int[NUMS_COUNT];
        String[] binary = new String[NUMS_COUNT];
        // create instance of Random class
        Random aleatorio = new Random();
        // print table header
        System.out.println(HEADER);
        // generate 100 random numbers and show them on the screen
        for (int i = 0; i < nums.length; i++) {
            // generate random number
            nums[i] = aleatorio.nextInt(MAX - MIN + 1) + MIN;
            // get binary number from random number
            binary[i] = binaryNumber(nums[i]);
            // print table content (position, number, binary number)
            System.out.printf("|\t#%d\t\t|  %d\t\t|  %s\n", i + 1, nums[i], binary[i]);
        }
        System.out.println("|-------------------------------------------------------|");
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
