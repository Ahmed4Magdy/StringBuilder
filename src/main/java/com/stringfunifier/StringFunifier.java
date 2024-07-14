package com.stringfunifier;
import java.util.ArrayList;
//import java.util.List;

//public class StringFunifier {
//     String boringString;
//     List<Integer> startIndexes;
//     List<Integer> endIndexes;
//
//public StringFunifier(String boringString, List<Integer> startIndexes, List<Integer> endIndexes) {
//        this.boringString = boringString;
//        this.startIndexes = startIndexes;
//        this.endIndexes = endIndexes;
//    }
//
//public String getFunnyString() {
//        StringBuilder result = new StringBuilder(boringString);
//
//        // Adjusting the replacement to handle multiple ranges correctly
//        List<String> replacements = new ArrayList<>();
//        for (int i = 0; i < startIndexes.size(); i++) {
//            int start = startIndexes.get(i);
//            int end = endIndexes.get(i);
//            StringBuilder toReverse = new StringBuilder(result.substring(start, end + 1));
//            toReverse.reverse();
//            replacements.add("(" + toReverse.toString() + ")");
//        }
//
//        // Applying the replacements in reverse order to avoid messing up indexes
//        for (int i = startIndexes.size() - 1; i >= 0; i--) {
//            int start = startIndexes.get(i);
//            int end = endIndexes.get(i);
//            result.replace(start, end + 1, replacements.get(i));
//        }
//
//        return result.toString();
//    }
//}

import java.util.Scanner;

//public class StringFunifier {
//    private String boringString;
//    private int[] startIndexes;
//    private int[] endIndexes;
//
//    public StringFunifier(String boringString, int[] startIndexes, int[] endIndexes) {
//        this.boringString = boringString;
//        this.startIndexes = startIndexes;
//        this.endIndexes = endIndexes;
//    }
//
//    public String getFunnyString() {
//        StringBuilder result = new StringBuilder();
//        int currentIndex = 0;
//
//        for (int i = 0; i < startIndexes.length; i++) {
//            int start = startIndexes[i];
//            int end = endIndexes[i];
//
//            // Append the segment before the current range
//            result.append(boringString, currentIndex, start);
//
//            // Reverse the current range and append it with parentheses
//            StringBuilder toReverse = new StringBuilder(boringString.substring(start, end + 1));
//            result.append("(").append(toReverse.reverse().toString()).append(")");
//
//            // Update the current index to the position after the current range
//            currentIndex = end + 1;
//        }
//
//        // Append any remaining characters after the last range
//        result.append(boringString.substring(currentIndex));
//
//        return result.toString();
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringFunifier {
    private String boringString;
    private List<Integer> startIndexes;
    private List<Integer> endIndexes;

    public StringFunifier(String boringString, List<Integer> startIndexes, List<Integer> endIndexes) {
        this.boringString = boringString;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
    }

    public String getFunnyString() {
        StringBuilder funnyString = new StringBuilder();
        int lastIndex = 0;

        for (int i = 0; i < startIndexes.size(); i++) {
            int startIndex = startIndexes.get(i);
            int endIndex = endIndexes.get(i);

            // Append the part of the string before the current range
            funnyString.append(boringString, lastIndex, startIndex);

            // Get the substring for the current range and reverse it
            String substring = boringString.substring(startIndex, endIndex + 1);
            String reversedSubstring = new StringBuilder(substring).reverse().toString();

            // Append the reversed substring surrounded by ()
            funnyString.append("(").append(reversedSubstring).append(")");

            // Update lastIndex to the end of the current range
            lastIndex = endIndex + 1;
        }

        // Append any remaining part of the string after the last range
        funnyString.append(boringString.substring(lastIndex));

        return funnyString.toString();
    }
}


