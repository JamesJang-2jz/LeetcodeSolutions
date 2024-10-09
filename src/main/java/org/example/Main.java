package org.example;

import JavaBasicExercise.CheckStringVowels;
import JavaBasicExercise.JavaBasicQuestions;
import JavaBasicExercise.PrimeNumberCheck;
import JavaBasicExercise.ReverseString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static String james = "James";
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            integerList.add(i);
            System.out.println("i = " + i);
        }
        int[] arrayIntegers = integerList.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(ReverseString.reverseString(james));

        System.out.println("does " + james + " contain vowels: " + CheckStringVowels.stringContainsVowels(james));

        System.out.println(PrimeNumberCheck.isItPrime(5));
        // only odd numbers?
        System.out.println(JavaBasicQuestions.onlyOddNumbers(new ArrayList<>(Arrays.asList(3,5,7,9))));

        System.out.println(JavaBasicQuestions.removeWhitespaces(" james cant code  "));
        System.out.println(JavaBasicQuestions.removeSpaces(" james removed spaces  "));
        // removeSpacesStrip uses strip() vs trim(). strip() is recommended because it uses the Unicode standard.
        // trim method identifies any character with a codepoint value less than or equal to U+0020 as a whitespace character
        System.out.println(JavaBasicQuestions.removeSpacesStrip("    james can sometimes code  "));

        JavaBasicQuestions.fibonacci(9);
        System.out.println();
        System.out.println("index of target is " + JavaBasicQuestions.binarySearch(new int[] {2,4,6,2,23,45,2,7,53,24,345,74,96}, 24));

        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};
        System.out.println(JavaBasicQuestions.sameElements(a1, a2));
        System.out.println(JavaBasicQuestions.sameElements(a1, a3));

        int[] secondHigh = new int[] {4,24,56,2,64,43,57};
        System.out.println("second highest in array is " + JavaBasicQuestions.findSecondHighest(secondHigh));
    }

}