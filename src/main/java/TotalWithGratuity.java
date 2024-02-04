import java.util.Scanner;

public class TotalWithGratuity {
  public static void main(String[] args) {
    
    // Create a scanner object to get user input.
    java.util.Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter the subtotal and the gratuity rate.
    System.out.print("Enter the subtotal followed by the gratuity rate: ");

    // Read the gratuity rate from the user.
    double subtotal = scanner.nextDouble();
    double gratuityRate = scanner.nextDouble();

    // Calculate the gratuity and total.
    double gratuity = (gratuityRate / 100) * subtotal;
    double total = subtotal + gratuity;

    // Display results to user.
    System.out.printf("The gratuity is " + gratuity + " and the total is " + total);

    // Close the scanner.
    scanner.close();

  }
}