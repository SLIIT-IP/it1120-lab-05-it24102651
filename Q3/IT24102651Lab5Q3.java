import java.util.Scanner;

public class IT24102651Lab5Q3 {

    // Constants
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int DISCOUNT_3_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input start and end dates
        System.out.print("Enter start day of reservation (1-31): ");
        int startDay = scanner.nextInt();

        System.out.print("Enter end day of reservation (1-31): ");
        int endDay = scanner.nextInt();

        // Calculate number of days reserved
        int daysReserved = endDay - startDay + 1;

        // Determine discount rate
        int discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        // Calculate total cost before and after discount
        double totalCost = daysReserved * ROOM_CHARGE_PER_DAY;
        double discount = (totalCost * discountRate) / 100;
        double totalAmountToPay = totalCost - discount;

        // Output results
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.printf("Total amount to be paid: Rs %.2f%n", totalAmountToPay);
    }
}
