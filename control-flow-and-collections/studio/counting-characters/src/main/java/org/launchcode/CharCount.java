package org.launchcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharCount {

    public static void main(String[] args) {

        String sample = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms " +
                "over to one side, you can put the quadratics into a form that " +
                "can be factored allowing that side of the equation to equal " +
                "zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> counts = new HashMap<>();
        char[] charactersInString = sample.toCharArray();

        for (char c : charactersInString) {
            if (!counts.containsKey(c)) {
                counts.put(c, 1);
            } else {
                counts.put(c, counts.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.printf("%s: %s%s", count.getKey(), count.getValue(), System.lineSeparator());
        }

    }

}
