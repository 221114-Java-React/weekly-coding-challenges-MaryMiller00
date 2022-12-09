package com.revature.problem3;
import java.util.HashMap;
import java.util.*;
import java.util.Map;


public class Solution {
    public String wordCount(String sentence) {
       // throw new RuntimeException("TODO! Needs implementation...");
            //create a map
            Map<String, Integer> hash = new HashMap<>();
            Map<String, Integer> hash2 = new HashMap<>();
            String[] wrd = sentence.split(" ");
            //we are splitting the different words into an array

            //while x is less than the array size
            for(String x : wrd){

                if(hash.containsKey(x))
                hash.put(x, hash.get(x)+1);

                else
                
                 hash.put(x, 1);
            }
           

                for(String x : wrd){
                    if(hash.containsKey(x))

            if(!hash.containsValue(1)){
                hash2.put(x, hash.get(x)+1);
            }
        }

            return hash2.toString();
    }
}
