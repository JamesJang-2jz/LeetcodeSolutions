package JavaBasicExercise;

public class CheckStringVowels {

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
