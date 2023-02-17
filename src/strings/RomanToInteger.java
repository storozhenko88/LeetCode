package strings;

import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }


    public static int romanToInt(String s) {
        HashMap<Character, Integer> romeNumbers = new HashMap<>();
        romeNumbers.put('I', 1);
        romeNumbers.put('V', 5);
        romeNumbers.put('X', 10);
        romeNumbers.put('L', 50);
        romeNumbers.put('C', 100);
        romeNumbers.put('D', 500);
        romeNumbers.put('M', 1000);

        int sum = 0;
        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1) {
                sum += romeNumbers.get(str[i]);
            } else if (str[i] == 'I' && str[i + 1] == 'V') {
                sum = sum + 4;
                i++;
            } else if (str[i] == 'I' && str[i + 1] == 'X') {
                sum = sum + 9;
                i++;
            } else if (str[i] == 'X' && str[i + 1] == 'L') {
                sum = sum + 40;
                i++;
            } else if (str[i] == 'X' && str[i + 1] == 'C') {
                sum = sum + 90;
                i++;
            } else if (str[i] == 'C' && str[i + 1] == 'D') {
                sum = sum + 400;
                i++;
            } else if (str[i] == 'C' && str[i + 1] == 'M') {
                sum = sum + 900;
                i++;
            } else sum = sum + romeNumbers.get(str[i]);
        }
        return sum;
    }

}
