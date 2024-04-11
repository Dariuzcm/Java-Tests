package com.solucionfactible.dev;

import java.util.Arrays;

/**
 * comp checks whether the two arrays have the "same" elements, with the same
 * multiplicities. "Same" means, here, that the elements in b are the elements
 * in a squared, regardless of the order.
 *
 * @author developer
 */
public class AreSame {

    public static boolean comp(int[] a, int[] b) {
           if (a == null || b == null || a.length != b.length) {
            return false;
        }

        int[] squaredA = Arrays.stream(a).map(i -> i * i).toArray();
        Arrays.sort(squaredA);
        Arrays.sort(b);

        return Arrays.equals(squaredA, b);
    }

}
