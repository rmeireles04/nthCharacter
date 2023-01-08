package org.example;

import java.util.*;

public class NthCharacter {

    public static String nthCharacter(String str, int N) {

        /** Declare a Map object to store the character counter */
        Map<Character, Integer> counters = new LinkedHashMap<>();


        /** Retrive empty String if the N is bigger than given String
         *  length or if less than zero*/
        if (N > str.length() || N < 0) {
            return "";
        }


        /** Iterate over the input string, if not lowercase
         * checks if its already there and increment count if not
         * puts into the Map and add with count of one*/

        for (int i = N - 1; i < str.length(); i += N) {
            char c = str.charAt(i);
            if (!(c > 96 && (c <= 122))) {
                int count;
                if (counters.containsKey(c)) {
                    count = counters.get(c);
                } else {
                    count = 0;
                }
                counters.put(c, count + 1);
            }
        }

        /** Initialize an empty string.
         *  Iterate over the keys of the counters Map and
         *  gets the  value of each key and print it
         *  with the number of times ir appears, and then
         *  removes from the end the comma and space */
        String output = "";
        for (Character key : counters.keySet()) {
            int value = counters.get(key);
            output += (key + " = " + value + ", ");
        }
        output = output.substring(0, output.length() - 2);
        System.out.println(output);

        return output;
    }


}





