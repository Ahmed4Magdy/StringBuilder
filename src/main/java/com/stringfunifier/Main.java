
package com.stringfunifier;
import com.stringfunifier.StringFunifier;
import java.util.*;



 public class Main{
     

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the boring string:");
        String boringString = scanner.nextLine();

        System.out.println("Enter the number of ranges:");
        
        
        
        int numRanges = scanner.nextInt();

        List<Integer> startIndexes = new ArrayList<>();
        List<Integer> endIndexes = new ArrayList<>();
System.out.println("Enter start :");
        for (int i = 0; i < numRanges; i++) {
//          System.out.println("Enter start index for range " + (i + 1) + ":");
            startIndexes.add(scanner.nextInt());
        }
     System.out.println("Enter end :");
         for (int i = 0; i < numRanges; i++) {
//            System.out.println("Enter end index for range " + (i + 1) + ":");
            endIndexes.add(scanner.nextInt());
         }
         

        StringFunifier funifier = new StringFunifier(boringString, startIndexes, endIndexes);
        System.out.println("Funny String: " + funifier.getFunnyString());
    }
}

//
// public class Main{
// public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the boring string:");
//        String boringString = scanner.nextLine();
//
//        System.out.println("Enter the start indexes (comma-separated):");
//        String startIndexesInput = scanner.nextLine();
//        System.out.println("Enter the end indexes (comma-separated):");
//        String endIndexesInput = scanner.nextLine();
//
//        // Parse the start and end indexes
//        List<Integer> startIndexes = new ArrayList<>();
//        List<Integer> endIndexes = new ArrayList<>();
//
//        String[] startIndexesArray = startIndexesInput.split(",");
//        String[] endIndexesArray = endIndexesInput.split(",");
//
//        for (String s : startIndexesArray) {
//            startIndexes.add(Integer.parseInt(s.trim()));
//        }
//
//        for (String e : endIndexesArray) {
//            endIndexes.add(Integer.parseInt(e.trim()));
//        }
//
//        StringFunifier funifier = new StringFunifier(boringString, startIndexes, endIndexes);
//        System.out.println("Funny String: " + funifier.getFunnyString());
//    }
//}
// 