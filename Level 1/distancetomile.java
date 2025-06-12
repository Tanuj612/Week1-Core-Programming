// package Level 1;5

public class distancetomile {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter the distance in kilometers:");
        double kilometers = sc.nextDouble();
        
        double miles = kilometers * 0.621371;
        
        System.out.println("The distance in miles is: " + miles);
        
        sc.close();
    }
    
}
