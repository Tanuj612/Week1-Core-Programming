import java.util.Scanner;
public class heightinchto {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Height_in_cm = sc.nextInt();
        
        double Height_in_inches = Height_in_cm / 2.54;  
             
        double Height_in_feet = Height_in_inches / 12;
        
        System.out.println("Height in feet: " + (int)Height_in_feet);
    }
}