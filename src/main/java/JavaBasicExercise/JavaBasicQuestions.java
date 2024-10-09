package JavaBasicExercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaBasicQuestions {

    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindromeString(String input) {
        boolean equal = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                equal = false;
                break;
            }
        }
        return equal;
    }

    public static String removeWhitespaces(String input) {
        StringBuilder sb =  new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeSpaces(String input){
        input = input.replace(" ", "");
        return input;
    }


    public static String removeSpacesStrip(String input) {
        String response = input.strip();
        return response;
    }

    public static int[] sortIntArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void fibonacci(int number) {
        int a = 0;
        int b = 1;
        int c = 1;

//        0, 1, 1, 2, 3, 5, 8, 13~~;
        for (int i = 0; i < number; i++) {
            System.out.print(a + ", ");

            a = b;
            b = c;
            c = a + b;
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }

    public static boolean sameElements(Object[] arr1, Object[] arr2) {
        // hashset only holds unique values
        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(arr1));
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(arr2));

        if (uniqueElements1.size() != uniqueElements2.size()) return false;

        for (Object obj : uniqueElements1) {
            if (!uniqueElements2.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public static int findSecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHigh = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > highest) {
                secondHigh = highest;
                highest = i;
            } else if (i > secondHigh) {
                secondHigh = i;
            }
        }
        return secondHigh;
    }

    


}
