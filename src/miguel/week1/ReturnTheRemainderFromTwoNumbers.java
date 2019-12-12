package miguel.week1;

public class ReturnTheRemainderFromTwoNumbers {

    public static int remainder(int a, int b) {
        System.out.printf("a: %d , b: %d -> ", a, b);
        return a % b;
    }

    public static void main(String[] args) {

        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }

}
