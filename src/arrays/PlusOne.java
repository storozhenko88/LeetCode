package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class PlusOne {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 9};
        System.out.println(Arrays.toString(plusOne(numbers)));
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            if (digits[0] == 9 && digits[digits.length-1] == 9) {
                int count = 9;
                for (int num : digits)
                    if (num < count)
                        count = num;

                if (count == 9) {
                    int[] numbers = new int[digits.length + 1];
                    numbers[0] = 1;
                    for (int i = 1; i < digits.length; i++)
                        numbers[i] = 0;

                    return numbers;
                }
            }

            int[] numbers = new int[digits.length];
            int j = 1;
            while (digits[digits.length - j] == 9) {
                numbers[numbers.length - j] = 0;
                j++;
            }
            numbers[numbers.length - j] = digits[digits.length - j] + 1;

            for (int i = j + 1; i <= numbers.length; i++)
                numbers[numbers.length - i] = digits[digits.length - i];

            return numbers;

        }
    }
}
