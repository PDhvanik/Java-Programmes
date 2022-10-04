import java.util.*;
public class prime {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if (a==1) {
            System.out.println("Special Number");
        }
        else if (a==2) {
            System.out.println("Special Number");
        }    

        else if (a%2==0) {
            System.out.println("NotPrime Number");
        }
        else if (a%3==0){
            System.out.println("NotPrime Number");
        }
        else if (a%4==0) {
            System.out.println("NotPrime Number");
        }
        else if (a%5==0) {
            System.out.println("NotPrime Number");
        }
        else if (a%6==0) {
            System.out.println("NotPrime Number");
        }    
        else if (a%7==0) {
            System.out.println("NotPrime Number");
        }    
        else if (a%8==0) {
            System.out.println("NotPrime Number");
        }    
        else if (a%9==0) {
            System.out.println("NotPrime Number");
        }    
        else System.out.println("Prime Number");
            


    }
}
