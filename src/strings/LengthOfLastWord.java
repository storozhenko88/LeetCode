package strings;

import java.util.Arrays;

//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

    public static void main(String[] args) {
        String words = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(words));
    }

    public static int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");

        return str[str.length-1].length();
    }
}
