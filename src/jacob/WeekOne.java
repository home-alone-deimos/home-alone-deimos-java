package jacob;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

import jacob.Months;


public class WeekOne {

//***********************************************//
//guessing game for number of days in given month:
//***********************************************//

    static void calcMonths() {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        Object[] newKeys;
        Object key;
        HashMap<String, String> months;
        months = new HashMap<>();
        months.put("January", "31");
        months.put("February", "28");
        months.put("March", "31");
        months.put("April", "30");
        months.put("May", "31");
        months.put("June", "30");
        months.put("July", "31");
        months.put("August", "31");
        months.put("September", "31");
        months.put("October", "31");
        months.put("November", "30");
        months.put("December", "31");

        Random rando = new Random();
        newKeys = months.keySet().toArray();
        key = newKeys[rando.nextInt(newKeys.length)];
        System.out.println(key);
        System.out.println("Random" + months.get(key));
        boolean newFlag = true;
        System.out.println("Here is your first challenge...");
        System.out.println("Can you guess how many days are in the month of: " + key);
        String userGuess = sc.nextLine();

        while (newFlag)
            if (userGuess.equalsIgnoreCase(months.get(key))) {
                System.out.println("Great job, you guessed it!");
                System.out.println("Play again?");
                userGuess = sc.nextLine();
                if (userGuess.equalsIgnoreCase("yes") || userGuess.equalsIgnoreCase("y")) {
                    calcMonths();
                } else {
                    newFlag = false;
                }
            } else {
                System.out.println("Please try another number!");
                userGuess = sc.nextLine();
                i++;
                if (i >= 3) {
                    System.out.println("Do you want to keep guessing?");
                    userGuess = sc.nextLine();
                    if (userGuess.equalsIgnoreCase("no")) {
                        System.out.println("Have a great day!");
                        newFlag = false;
                    } else {
                        i = 0;
                    }
                }
            }
     }
    public static void main(String[] args) {
        calcMonths();
    }
}
