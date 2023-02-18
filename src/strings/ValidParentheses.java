package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if (s.length() == 0)
            return false;

        if (s.length() % 2 == 1)
            return false;

        LinkedHashMap<Character, Integer> stringPoll = new LinkedHashMap<>();
        stringPoll.put('(', 0);
        stringPoll.put(')', 0);
        stringPoll.put('{', 0);
        stringPoll.put('}', 0);
        stringPoll.put('[', 0);
        stringPoll.put(']', 0);


        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (stringPoll.containsKey(s.charAt(i))) {
                count = stringPoll.get(s.charAt(i));

                if (count == 0)
                    count++;

                stringPoll.put(s.charAt(i), count);
            }
        }
        if (stringPoll.get('(').intValue() == stringPoll.get(')').intValue())
            if (stringPoll.get('{').intValue() == stringPoll.get('}').intValue())
                if (stringPoll.get('[').intValue() == stringPoll.get(']').intValue())
                    return true;

        return false;
    }
}
