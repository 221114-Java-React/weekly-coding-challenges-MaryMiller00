package com.revature.problem1;
import java.util.*;
import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
       // throw new RuntimeException("TODO! Needs implementation...");
        //sort array
       Arrays.sort(arr);

        int min = 0;
        int max = arr.length -1; 
        int result = k+1;

        //while loop for finding the middle and searching the elements
        while(min<=max){//while min is less than or equal to the max
            //mid
            int mid = (min+max)/2;

            if(arr[mid]<= result){//if the middle value is less than or equal to k
                
                //and if the midle is = to k
                if(arr[mid] == result){
                    //searching increased by one
                    result ++;

                    // max is set
                    max = arr.length-1;
                }
                //the min becomes the middle
                min = mid +1;
            }
            //else we want the max to be the middle
            else
                max = mid - 1;
        }
        //then we return the element that is greater
        return result;
    }
}
