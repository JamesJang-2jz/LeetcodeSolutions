package LeetyQuestions;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntLC {

    public int romanToInt(String s){
        int result = 0;
        int num = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            switch(s.charAt(i)){
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (num * 4 < result){
                result -= num;
            } else {
                result += num;
            }
        }
        return result;
    }

    public int romanToInt(String s, String iterateFrom0){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
