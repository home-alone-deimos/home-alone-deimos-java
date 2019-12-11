package jacob;

public class RestaurantDish {

    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;


    void eat() {
        System.out.println("Nom Nom Nom");
    }
}

 class RestaurantTest {
     public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 300;
        dish.nameOfDish = "spaghetti";
        dish.wouldRecommend = true;
         System.out.println("This dish costs: " + dish.costInCents + " cents and it's name is: " +  dish.nameOfDish + ". And of course, would I recommend it? " + dish.wouldRecommend);
         dish.eat();

     }
}
