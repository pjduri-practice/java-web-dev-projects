package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] intsArray = {1, 1, 2, 3, 5, 8};
        for (int i : intsArray) {
            if (i % 2 != 0) System.out.println(i);
        }
        System.out.println();
        String catInHat = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] catArr = catInHat.split("\\.");
        System.out.println(Arrays.toString(catArr));
    }





}
