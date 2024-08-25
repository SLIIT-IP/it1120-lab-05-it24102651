import java.util.Scanner;

public class IT24102651Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        int numberOfMembers = scanner.nextInt();

        // Validate the input
        if (numberOfMembers < 0) {
            System.out.println("Invalid input! The number of new members cannot be negative.");
        } else {
            // Determine the prize using a switch statement
            String prize;
            switch (numberOfMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            // Print the prize
            System.out.println("The prize for introducing " + numberOfMembers + " new members is: " + prize);
        }
        
        // Close the scanner
        scanner.close();
    }
}
