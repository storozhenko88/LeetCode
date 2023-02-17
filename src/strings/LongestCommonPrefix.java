package strings;

import java.util.ArrayList;
import java.util.HashMap;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};


        System.out.println(longestCommonPrefix(words));
    }

    public static String longestCommonPrefix(String[] strs) {
        String buffer = "";
        Character letter = null;
        int minSizeWord = 0;
        HashMap<String, ArrayList<Character>> wordsToChar = new HashMap<>();

        for (String word : strs) {
            if (minSizeWord == 0 || minSizeWord > word.length())
                minSizeWord = word.length();

            char[] wordtoChar = word.toCharArray();

            for (int i = 0; i < wordtoChar.length; i++){
                if (wordsToChar.get(word) == null){
                    wordsToChar.put(word, new ArrayList<>());
                }
                wordsToChar.get(word).add(i, wordtoChar[i]);
            }

        }

        for (int i = 0; i < minSizeWord; i++) {
            for (String word : strs) {
                if (letter == null)
                    letter = wordsToChar.get(word).get(i);
                else if (wordsToChar.get(word).get(i) != letter)
                    return buffer;
            }
            buffer += letter;
            letter = null;
        }
        return buffer;
    }
}
