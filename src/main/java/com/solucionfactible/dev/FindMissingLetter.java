package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input
 * and that returns the missing letter in the array. You will always get an
 * valid array. And it will be always exactly one letter be missing. The length
 * of the array will always be at least 2.The array will always contain letters
 * in only one case. (Use the English alphabet with 26 letters)
 *
 * @author developer
 */
public class FindMissingLetter {
    
    public static char findMissingLetter(char[] array) {
        if (array.length < 2) {
            throw new Error("Invalid Array");
        }
        char start = array[0];
        char end = array[array.length - 1];
        List<Character> letters = new ArrayList<Character>();

        char ref = start;
        while (ref < end) {
            letters.add((char) (ref));
            ref++;
            
            if(ref < 65 && ref > 122
                 && ref > 90 && ref <97
            )
               throw new Error("Invalid characters");
        }
       
        Iterator<Character> rangeIterator = letters.iterator();
        char missing = 0;
        
        while (rangeIterator.hasNext()) {
            char current = rangeIterator.next();
            List<Character> toCheck = new ArrayList<Character>();
            for(char element: array) {
                toCheck.add(element);
            }
            if (!toCheck.contains(current)) {
                missing = current;
            }
        }
        
        if(missing == 0) throw new Error("Not Missing letters");
        
        return missing;
    }
}
