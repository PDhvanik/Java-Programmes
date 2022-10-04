import java.util.*;
public class Scorecard {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value either 0 or 1:");
         int n=sc.nextInt();
         if (n==0) {
            System.out.println("Please Enter 1 for Submit your marks.");
         }
         else {  
                 System.out.println("Enter your Marks out of 100:");
                 int marks=sc.nextInt();
                 if (marks>=90) {
                    System.out.println("This is Good");
                 } 
                 else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if(marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid");
     
                }
                
                 
         }
    }
}
