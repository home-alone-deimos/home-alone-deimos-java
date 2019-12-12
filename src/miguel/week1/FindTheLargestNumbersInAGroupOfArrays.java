package miguel.week1;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheLargestNumbersInAGroupOfArrays {
    public static double[] findLargestNums(double[][] arr) {
        ArrayList<Double> numberList = new ArrayList<>();
        double[] numberArr;
        for (double[] array : arr) { // for each array in the array container
//            Arrays.stream(array).reduce(array[0],(largest, number) -> (largest > number ? largest : number));
//            Arrays.stream(array).reduce(array[0],(largest, number) -> (Math.max(largest, number))); // Math.max call
//            Arrays.stream(array).reduce(array[0], Math::max); // replace lambda with method reference
            numberList.add(Arrays.stream(array).reduce(array[0], Math::max)); // add the largest number to array list
        }
        numberArr = new double[numberList.size()]; // set size of array to size of list
        for (Double number : numberList) { // for each number in the list
            numberArr[numberList.indexOf(number)] = number; // change element value of array index, based off index in list, to the value
        }
        return numberArr;
    }

    public static void main(String[] args) {
        double[][] test1 = {{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}}; // [7, 90, 2]
        double[][] test2 = {{-34, -54, -74}, {-32, -2, -65}, {-54, 7, -43}}; // [-34, -2, 7]
        double[][] test3 = {{0.4321, 0.7634, 0.652}, {1.324, 9.32, 2.5423, 6.4314}, {9, 3, 6, 3}}; // [0.7634, 9.32, 9]
        System.out.printf("%s -> %s%n",Arrays.deepToString(test1),Arrays.toString(findLargestNums(test1)));
        System.out.printf("%s -> %s%n",Arrays.deepToString(test2),Arrays.toString(findLargestNums(test2)));
        System.out.printf("%s -> %s%n",Arrays.deepToString(test3),Arrays.toString(findLargestNums(test3)));
    }
}
