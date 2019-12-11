package jacob;

import java.util.HashMap;
import java.util.Scanner;


//it's a work in progress
public class FastFood {

    static void calculateTotal() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> prices = new HashMap<>();
        prices.put("1", 3.50);
        prices.put("2", 2.50);
        prices.put("3", 4.00);
        prices.put("4", 3.50);
        prices.put("5", 1.75);
        prices.put("6", 1.50);
        prices.put("7", 2.25);
        prices.put("8", 3.75);
        prices.put("9", 1.25);


        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }
//        Object[] key = prices.keySet().toArray();
//        int keySpot = 1;
//        System.out.println(key[keySpot]);
//        System.out.println(prices.get(key[keySpot]));
        Double newTotal = 0.00;
        Double userInput = sc.nextDouble();

    }



    public static void main(String[] args) {
        System.out.println("this is dumb.");
        calculateTotal();
    }
}
