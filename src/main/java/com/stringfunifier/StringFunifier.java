package com.stringfunifier;
import java.util.ArrayList;
import java.util.List;

public class StringFunifier {
     String boringString;
     List<Integer> startIndexes;
     List<Integer> endIndexes;

public StringFunifier(String boringString, List<Integer> startIndexes, List<Integer> endIndexes) {
        this.boringString = boringString;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
    }

public String getFunnyString() {
        StringBuilder result = new StringBuilder(boringString);

        // Adjusting the replacement to handle multiple ranges correctly
        List<String> replacements = new ArrayList<>();
        for (int i = 0; i < startIndexes.size(); i++) {
            int start = startIndexes.get(i);
            int end = endIndexes.get(i);
            StringBuilder toReverse = new StringBuilder(result.substring(start, end + 1));
            toReverse.reverse();
            replacements.add("(" + toReverse.toString() + ")");
        }

        // Applying the replacements in reverse order to avoid messing up indexes
        for (int i = startIndexes.size() - 1; i >= 0; i--) {
            int start = startIndexes.get(i);
            int end = endIndexes.get(i);
            result.replace(start, end + 1, replacements.get(i));
        }

        return result.toString();
    }
}