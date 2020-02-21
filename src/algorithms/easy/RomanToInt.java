package algorithms.easy;

public class RomanToInt {

    public int romanToInt(String s) {
        int intNumber = 0;
        if (s.length() > 1) {
            int last = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                String currentCharacter = s.substring(i, i + 1);
                int current = mapSingleRomanToInt(currentCharacter);
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
        switch (romanDigit) {
            case "I" : return 1;
            case "V" : return 5;
            case "X" : return 10;
            case "L" : return 50;
            case "C" : return 100;
            case "D" : return 500;
            case "M" : return 1000;
        }
        return 0;
    }
}
