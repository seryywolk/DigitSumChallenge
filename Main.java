package com.codewithserdar;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits in number 200 is " + sumDigits(200));
        System.out.println("The sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of digits in number 239 is " + sumDigits(239));
        System.out.println("The sum of digits in number 999 is " + sumDigits(999));
    }
    private static int sumDigits(int number) {
        if(number< 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0){
            // extract the least significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least significant digit
            number /= 10;  // same as number = number / 10;
        }
        return sum;
    }
}
