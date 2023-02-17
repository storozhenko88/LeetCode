package arrays;

import java.util.ArrayList;

//https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 42;
        System.out.println(isPalindrome(number));
    }

    //v1.0
    //    public static boolean isPalindrome(int x) {
//
//        String stringNumber = Integer.toString(x);
//        char[] numbers = stringNumber.toCharArray();
//        for (int i = 0; i < numbers.length/2; i++){
//            if (numbers[i] != numbers[numbers.length-1])
//                return false;
//            }
//        return true;
//        }

    //v2.0
//    public static boolean isPalindrome(int x) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        while (x != 0){
//            numbers.add(x%10);
//            x = x/10;
//        }
//        for (int i = 0; i < numbers.size()/2; i++){
//            if (numbers.get(i) != numbers.get(numbers.size()-1-i))
//                return false;
//            }
//        return true;
//    }
    public static boolean isPalindrome(int x) {
        int sum = 0;
        int buffer = x;
        if (x < 0)
            return false;

        while (x != 0){
            sum = sum*10 + x%10;
            x = x/10;
        }
        if (sum == buffer)
            return true;
        else return false;
    }
}
