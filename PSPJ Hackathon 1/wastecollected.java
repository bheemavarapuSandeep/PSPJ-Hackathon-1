import java.util.Scanner;

public class wastecollected {

    // Method to calculate total waste collected
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read waste collected from point 1 and point 2
        System.out.print("Enter waste collected at point 1: ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste collected at point 2: ");
        double point2Waste = sc.nextDouble();

        // Call the method
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        // Display the total waste collected
        System.out.println("Total waste collected: " + totalWaste);

        sc.close();
    }
}

