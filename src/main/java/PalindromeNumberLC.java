public class PalindromeNumberLC {

    public boolean isPalindrome(int x){
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public boolean isPalindrome(int x, String compareReverse){
        String str = String.valueOf(x);
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return (reverse.equals(str));
    }
}
