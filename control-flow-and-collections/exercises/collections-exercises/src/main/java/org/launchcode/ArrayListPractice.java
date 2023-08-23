package org.launchcode;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> someInts = new ArrayList<>(Arrays.asList(1,7,2,9,34));
        ArrayList<String> someWords = new ArrayList<>(Arrays.asList("Aardvark", "binomial", "rocks", "phone", "wallpaper"));
        String catString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] catArray = catString.split(" ");
        ArrayList<String> catArrayList = new ArrayList<>(Arrays.asList(catArray));
        int numChars;


        System.out.println("Even numbers from array: " + someInts + findSumEven(someInts));
        System.out.println("We've got a list of words.  Please enter the word length you would like to see: ");
        numChars = input.nextInt();

        System.out.println(findFiveLetterWords(catArrayList, numChars));
    }

    public static int findSumEven(ArrayList<Integer> ints) {
        int sum = 0;
        for (Integer i : ints) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }

    public static ArrayList<String> findFiveLetterWords(ArrayList<String> words, int numChars) {
        ArrayList<String> newWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == numChars) newWords.add(word);
        }
        return newWords;
    }

}
