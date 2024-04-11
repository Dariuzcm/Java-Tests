package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative
 * persistence, which is the number of times you must multiply the digits in num
 * until you reach a single digit.
 *
 * @author developer
 */
public class Persistence {

    public static int persistence(long num) {
        int persistence = 0;

        while (num >= 10) {
            int product = 1;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }
            num = product;
            persistence++;
        }

        return persistence;
    }

}
