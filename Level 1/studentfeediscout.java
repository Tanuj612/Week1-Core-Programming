// package Level 1;

public class studentfeediscout {
    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        double totalFee = 0;
        double totalDiscount = 0;
        
       
            System.out.println("Enter the fee for student " + i + ":");
            double fee = sc.nextDouble();
            System.out.println("Enter the discount for student " + i + ":");
            double discount = sc.nextDouble();
            
            totalFee = fee;
            totalDiscount = discount;
        
        
        System.out.println(totalFee-totalDiscount);
        // System.out.println("Total Discount: " + totalDiscount);
    }
    
}
