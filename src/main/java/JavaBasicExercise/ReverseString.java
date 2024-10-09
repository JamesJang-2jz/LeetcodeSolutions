package JavaBasicExercise;

public class ReverseString {

    public ReverseString() {
    }

    public static String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null is invalid input");
        }

        StringBuilder sb = new StringBuilder();

        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return  sb.toString();
    }
}


