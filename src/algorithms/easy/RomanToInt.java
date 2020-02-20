package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    private Map<String, Integer> romanIntMapping = new HashMap<>();

    {
        romanIntMapping.put("I", 1);
        romanIntMapping.put("V", 5);
        romanIntMapping.put("X", 10);
        romanIntMapping.put("L", 50);
        romanIntMapping.put("C", 100);
        romanIntMapping.put("D", 500);
        romanIntMapping.put("M", 1000);
    }

    public int romanToInt(String s) {
        int intNumber = 0;
        if (s.length() > 1) {
            String currentCharacter = s.substring(s.length() - 1);
            int current;
            int last = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                current = mapSingleRomanToInt(currentCharacter);
                if (current >= last) {
                    intNumber += current;
                } else {
                    intNumber -= current;
                }
                last = current;
            }
        } else if (!s.equals("0")) {
            return mapSingleRomanToInt(s);
        }
        return intNumber;
    }

    private int mapSingleRomanToInt(String romanDigit) {
        return romanIntMapping.get(romanDigit);
    }
}
