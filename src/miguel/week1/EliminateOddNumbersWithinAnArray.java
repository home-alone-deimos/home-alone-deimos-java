package miguel.week1;

import java.util.ArrayList;
import java.util.Arrays;

public class EliminateOddNumbersWithinAnArray {

    public static int[] noOdds(int[] nums) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int number : nums) {
            myList.add(number);
        }
        myList.removeIf(n -> (n % 2 != 0));
        int[] myArr = new int[myList.size()];
        for (Integer number : myList) {
            myArr[myList.indexOf(number)] = number;
        }
        return myArr;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] test2 = new int[]{43, 65, 23, 89, 53, 9, 6};
        int[] test3 = new int[]{718, 991, 449, 644, 380, 440};
        System.out.printf("%s -> %s%n", Arrays.toString(test1) , Arrays.toString(noOdds(test1)));
        System.out.printf("%s -> %s%n", Arrays.toString(test2) , Arrays.toString(noOdds(test2)));
        System.out.printf("%s -> %s%n", Arrays.toString(test3) , Arrays.toString(noOdds(test3)));
    }
}
