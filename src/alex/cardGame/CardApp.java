package alex.cardGame;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CardApp {
    public static void main(String[] args) {
        Card[] deck = CardsArray.getAllCards();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> used = new ArrayList<>();
        ArrayList<Card> playerHand = new ArrayList<>();
        ArrayList<Card> dealerHand = new ArrayList<>();
        int money = 1000;
        int bet;
        int newCard;
        boolean win;
        boolean again = false;
        boolean broke = false;

        System.out.println("Welcome to BlackJack!");
        System.out.println("The rules are simple. Get as close to 21 as possible without going over.");
        System.out.println("Numbers are equal to their values. Face cards are worth 10. Aces are worth 1 or 11.");
        System.out.printf("\nYou have $%s.\n", money);
        do {
            System.out.println("How much would you like to bet?");

            do{
                bet = 0;
                try{
                    bet = scanner.nextInt();
                    scanner.nextLine();
                    if (bet < 1){
                        System.out.println("Needs to be positive number.");
                    }
                    if (bet > money){
                        System.out.println("You don't have that much cash! Try again:");
                    }
                } catch(InputMismatchException e){
                    System.out.println("Needs to be number:");
                    scanner.next();
                }
            } while (bet < 1 || bet > money);
            int playerNumber = 0;
            int dealerNumber = 0;
            boolean dealerBust = false;
            boolean playerBust = false;
            boolean stay = false;
            System.out.println("Dealing cards...");
            int dealCard = (int) getRandom(0, 51, used);
            playerHand.add(deck[dealCard]);
            used.add(dealCard);
            dealCard = (int) getRandom(0, 51, used);
            playerHand.add(deck[dealCard]);
            used.add(dealCard);
            dealCard = (int) getRandom(0, 51, used);
            dealerHand.add(deck[dealCard]);
            used.add(dealCard);
            dealCard = (int) getRandom(0, 51, used);
            dealerHand.add(deck[dealCard]);
            used.add(dealCard);
            System.out.println("Your Hand: ");
            for (Card card : playerHand){
                card.getCard();
                playerNumber += card.getValue();
            }
            if (playerNumber == 21){
                System.out.println("Wow! That's 21!");
                stay = true;
            }
            System.out.println("\nDealer's Hand:  ");
            dealerHand.get(1).dealerShows();
            while (!playerBust && !stay){
                System.out.println("Hit or stay?");
                String choose = scanner.nextLine();
                while (!choose.equalsIgnoreCase("hit") && !choose.equalsIgnoreCase("stay")){
                    System.out.println("Need to enter hit or stay.");
                    choose = scanner.nextLine();
                }
                if (choose.equalsIgnoreCase("stay")){
                    stay = true;
                }
                else {
                    newCard = (int) getRandom(0, 51, used);
                    playerHand.add(deck[newCard]);
                    playerNumber = 0;
                    System.out.println("Your Hand: ");
                    for (Card card : playerHand){
                        card.getCard();
                        playerNumber += card.getValue();
                    }
                    if (playerNumber > 21){
                        int loop = 0;
                        for (int i = 0; i < playerHand.size(); i++){
                            if (playerHand.get(i).isAce()){
                                playerNumber -= 10;
                                loop = i + 1;
                                break;
                            }
                        }
                        if (playerNumber > 21){
                            for (int i = loop; i < playerHand.size(); i++){
                                if (playerHand.get(i).isAce()){
                                    playerNumber -= 10;
                                    loop = i + 1;
                                    break;
                                }
                            }
                            if (playerNumber > 21){
                                for (int i = loop; i < playerHand.size(); i++){
                                    if (playerHand.get(i).isAce()){
                                        playerNumber -= 10;
                                        loop = i + 1;
                                        break;
                                    }
                                }
                                if (playerNumber > 21){
                                    for (int i = loop; i < playerHand.size(); i++){
                                        if (playerHand.get(i).isAce()){
                                            playerNumber -= 10;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (playerNumber > 21){
                            playerBust = true;
                        }
                    }
                    if (playerNumber == 21){
                        System.out.println("You got 21!");
                        stay = true;
                    }

                }
            }
            System.out.println("Your total is " + playerNumber + "\n");
            if (playerBust){
                System.out.println("You have busted. That's too bad...");
                win = false;
            }
            else {
                System.out.println("Dealer shows cards: ");
                for (Card card : dealerHand) {
                    card.dealerShows();
                    dealerNumber += card.getValue();
                }
                if (dealerNumber == 21) {
                    System.out.println("Dealer got 21. That's too bad...");
                    win = false;
                } else {
                    int spot = 2;
                    while (!dealerBust && dealerNumber < 17) {
                        newCard = (int) getRandom(0, 51, used);
                        dealerHand.add(deck[newCard]);
                        dealerNumber = 0;
                        dealerHand.get(spot).dealerShows();
                        spot++;
                        for (Card card : dealerHand) {
                            dealerNumber += card.getValue();
                        }
                        if (dealerNumber > 21) {
                            int loop = 0;
                            for (int i = 0; i < dealerHand.size(); i++) {
                                if (dealerHand.get(i).isAce()) {
                                    dealerNumber -= 10;
                                    loop = i + 1;
                                    break;
                                }
                            }
                            if (dealerNumber > 21) {
                                for (int i = loop; i < dealerHand.size(); i++) {
                                    if (dealerHand.get(i).isAce()) {
                                        dealerNumber -= 10;
                                        loop = i + 1;
                                        break;
                                    }
                                }
                                if (dealerNumber > 21) {
                                    for (int i = loop; i < dealerHand.size(); i++) {
                                        if (dealerHand.get(i).isAce()) {
                                            dealerNumber -= 10;
                                            loop = i + 1;
                                            break;
                                        }
                                    }
                                    if (dealerNumber > 21) {
                                        for (int i = loop; i < dealerHand.size(); i++) {
                                            if (dealerHand.get(i).isAce()) {
                                                dealerNumber -= 10;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (dealerNumber > 21) {
                                dealerBust = true;
                            }
                        }
                    }
                }
                if (dealerBust) {
                    win = true;
                    System.out.println("The Dealer has busted. You win the hand!");
                } else {
                    System.out.println("\nYour number is " + playerNumber);
                    System.out.println("Dealer number is " + dealerNumber);
                    if (dealerNumber > playerNumber) {
                        System.out.println("The dealer has the greater number. You lose.");
                        win = false;
                    } else if (playerNumber > dealerNumber) {
                        System.out.println("You have a greater number. You win!");
                        win = true;
                    } else {
                        System.out.println("While it is a tie, House always wins. Too bad...");
                        win = false;
                    }

                }
            }
            if (win){
                System.out.println("You win $" + bet);
                money += bet;
            }
            else {
                System.out.println("You lost $" + bet);
                money -= bet;
            }
            System.out.println("You now have $" + money);
            if (money <= 0){
                broke = true;
            }
            playerHand.clear();
            dealerHand.clear();
            used.clear();
            System.out.println("Bet again?");
            if (!broke){
                again = yesNo();
            }
            else {
                System.out.println("Just kidding, you're broke!");
            }
        } while (again && !broke);
        if (money > 1000){
            System.out.printf("Congratulations! You now have $%s.\n", money);
            System.out.println("Don't spend it all in one place.");
        }
        else if (money == 1000){
            System.out.println("You broke even, it could've been worse....");
        }
        else {
            System.out.println("Ouch, you lost money! That was your 401k right there....");
        }
    }

    public static boolean yesNo(){
        Scanner scanner = new Scanner(System.in);
        String check;
        System.out.println("Enter yes (or y) for yes:");
        check = scanner.next();
        return check.equalsIgnoreCase("yes") || check.equalsIgnoreCase("y");
    }

    public static double getRandom(int min, int max, ArrayList<Integer> already){
        double card = (Math.random() * ((max - min) + 1) + min);
        while (already.contains((int) card)){
            card = (Math.random() * ((max - min) + 1) + min);
        }
        return card;
    }

}
