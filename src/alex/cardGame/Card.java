package alex.cardGame;

public class Card {
    private String suit;
    private int number;
    private String face;

    public Card(int number, String suit){
        this.number = number;
        this.suit = suit;
        if (number == 1){
            face = "Ace";
        }
        else if (number == 11){
            face = "Jack";
        }
        else if (number == 12){
            face = "Queen";
        }
        else if (number == 13){
            face = "King";
        }
        else {
            face = "none";
        }
    }


    public void getCard(){
        if (face.equals("none")){
            System.out.printf("You have %s of %s\n", number, suit);
        }
        else {
            System.out.printf("You have %s of %s\n", face, suit);
        }
    }

    public void dealerShows(){
        if (face.equals("none")){
            System.out.printf("Dealer shows %s of %s\n", number, suit);
        }
        else {
            System.out.printf("Dealer shows %s of %s\n", face, suit);
        }
    }

    public int getValue(){
        if (face.equals("none")){
            return number;
        }
        else {
            if (face.equals("Ace")){
                return 11;
            }
            else {
                return 10;
            }
        }
    }

    public boolean isAce(){
        return face.equals("Ace");
    }

}
