import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        
        // Check if the input is valid
        if (length <= 0 || width <= 0) {
            System.out.println("Invalid input.");
        } else {
            // Calculate the area, perimeter, and diagonal length
            double area = length * width;
            double perimeter = 2 * (length + width);
            double diagonal = Math.sqrt(length * length + width * width);
            
            // Output the results
            System.out.println("The area of the rectangle is: " + area);
            System.out.println("The perimeter of the rectangle is: " + perimeter);
            System.out.println("The diagonal length of the rectangle is: " + diagonal);
        }
    }
}
