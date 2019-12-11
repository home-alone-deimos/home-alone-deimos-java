package jacob;

public class BurgerTools {

    String mostPopularToppings;
    int averageDaysBeforeExpiration;
    int temperatureWhenCooked;
    void grill() {
        System.out.println("Grilling burger...");
    }
}

class BurgerTester {
    public static void main(String[] args) {
        BurgerTools quarterPounder = new BurgerTools();
        quarterPounder.mostPopularToppings = "Pineapple, teriyaki sauce";
        quarterPounder.temperatureWhenCooked = 165;
        System.out.println("Mmm you've chosen the Quarter Pounder Burger. Excellent Choice.");
        System.out.println("On this delicious slab of meat is " + quarterPounder.mostPopularToppings + " and the proper temperature to cook this to ensure safety is: " + quarterPounder.temperatureWhenCooked);
        quarterPounder.grill();
    }
}
