package miguel.week2;

public class Working9To5 {

    public static String overTime(double[] arr) {
        double hoursWorked = arr[1] - arr[0]; //13(1) - 18(6) -> 4 hours reg. 1 hour over
        if (arr[1] > 17) { // checks if person worked overtime(beyond 5)
            double overtimeRate = arr[2] * arr[3];
            if (arr[0] < 17) { // checks if person worked before the start of overtime(before 5)
                double regHours = 17 - arr[0]; // hours worked up to 5
                double overHours = hoursWorked - regHours; // hours worked after 5
                return String.format("$%.2f", (regHours * arr[2]) + (overHours * overtimeRate));
            } else {
                return String.format("$%.2f", hoursWorked * overtimeRate);
            }
        } else {
            return String.format("$%.2f", hoursWorked * arr[2]);
        }
    }

    public static void main(String[] args) {
        double[] test1 = {9, 17, 30, 1.5}; // 9-5 = $240
        double[] test2 = {16, 18, 30, 1.8}; // 4-6 = $84.00
        double[] test3 = {13.25, 15, 30, 1.5}; // 1:15-3 = $52.50
        double[] test4 = {18, 20, 32.5, 2}; // 6-8 = $130.00

        System.out.println(overTime(test1));
        System.out.println(overTime(test2));
        System.out.println(overTime(test3));
        System.out.println(overTime(test4));
    }
}
