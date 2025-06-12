// package Level 1;

import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        // Importing Scanner class for user input
        
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for input
        System.out.println("Enter the physics number:");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the chemistry number:");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the math number:");
        int num3 = sc.nextInt();
        
        // Calculating the average
        double average = (num1 + num2 + num3) / 3.0;
        
        // Displaying the result
        System.out.println("The average is: " + average);
        
        // Closing the scanner
        sc.close();
    }
    
}
