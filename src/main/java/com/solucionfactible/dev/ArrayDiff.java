package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
	public static int[] diff(int[] a, int[] b) {
            if(b.length == 0) return a;
      
            List<Integer> newArray = new ArrayList<Integer>();
            for(int element: a) {
                if(!contains(b, element)) {
                    newArray.add(element);
                }
            }    
            int[] array = new int[newArray.size()];
            array = newArray.stream().mapToInt( item -> item).toArray();
            return array;
	}
        
        public static boolean contains(int[] params, int compare) {
            for(int item: params) {
                if(item == compare) {
                  return true;
                }
            }
            return false;
        }
}
