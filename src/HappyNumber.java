import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public static void main(String[] args) {


        System.out.println(isHappy(7));
}


    public static boolean isHappy(int n) {
        if (n == 1)
            return true;

        if (n <= 0 || n >= (Math.pow(2, 30) - 1))
            return false;

        if (n > 1 && n < 10)
           return isHappy((int) Math.pow(n , 2));

        ArrayList<Integer> nums = new ArrayList<>();
        int temp = n;
        while(temp != 0){
            nums.add(temp%10);
            temp = temp / 10;
        }

//        Optional<Integer> reduce = nums.stream()
//                .map(s -> (int) Math.pow(s, 2))
//                .reduce((Integer o1, Integer o2) -> o1 + o2);

        return isHappy(nums.stream()
                .map(s -> (int) Math.pow(s, 2))
                .reduce((Integer o1, Integer o2) -> o1 + o2).get());

    }
}
