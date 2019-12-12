package alex;
import java.util.HashMap;
import java.util.Scanner;

public class monthQuiz {
    public static void main(String[] args) {
        int random;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> months = new HashMap<>();
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        months.put("January", 31);
        months.put("February", 28);
        months.put("March", 31);
        months.put("April", 30);
        months.put("May", 31);
        months.put("June", 30);
        months.put("July", 31);
        months.put("August", 31);
        months.put("September", 30);
        months.put("October", 31);
        months.put("November", 30);
        months.put("December", 31);
        System.out.println("This is month quiz. Guess the days of 3 months.");
        do {
            for (int i = 0; i < 3; i++){
                int guess = 0;
                random = (int) getRandom(0,11);
                System.out.printf("How many days are in %s?\n", month[random]);
                guess = scanner.nextInt();
                if (guess == months.get(month[random])){
                    System.out.println("You guessed right!");
                }
                else {
                    System.out.println("You guessed wrong...");
                }
            }

            System.out.println("Would you like to try again?");
        } while (yesNo());


    }

    public static boolean yesNo(){
        Scanner scanner = new Scanner(System.in);
        String check;
        System.out.println("Enter yes (or y) for yes:");
        check = scanner.next();
        return check.equalsIgnoreCase("yes") || check.equalsIgnoreCase("y");
    }

    public static double getRandom(int min, int max){
        return (Math.random() * ((max - min) + 1) + min);
    }
}
