package miguel.week2;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInteger {

    public static int findOdd(int[] arr) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int element : arr) { // iterate through array
            if (myMap.containsKey(element)) { // if key already exists add 1 to value
                myMap.put(element, myMap.get(element) + 1);
            } else {
                myMap.put(element, 1); // else add key/value pair to map
            }
        }

        for (Map.Entry<Integer, Integer> pair : myMap.entrySet()) {
            if (pair.getValue() % 2 != 0) {
                return pair.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] test2 = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] test3 = {10};

        System.out.println(findOdd(test1));
        System.out.println(findOdd(test2));
        System.out.println(findOdd(test3));

    }
}
