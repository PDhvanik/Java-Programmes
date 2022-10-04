import java.util.*;
public class FunctionPrime {
    public static void numbers(int n) {
          
        if(n==0){
          System.out.println("Invalid Number");
       }
       else if(n==1 || n==2){
           System.out.println("Special Number");
           return;
        }
         
      
        if (n%2==0) {
            
           System.out.println("Not a prime Number");
           return;
       }
       else if (n%3==0){
           System.out.println("Not a prime Number");

       }
       else if (n%9==0){
        System.out.println("Not a prime Number");

    } else if (n%4==0){
        System.out.println("Not a prime Number");

    } else if (n%5==0){
        System.out.println("Not a prime Number");

    } else if (n%6==0){
        System.out.println("Not a prime Number");

    } else if (n%7==0){
        System.out.println("Not a prime Number");

    } else if (n%8==0){
        System.out.println("Not a prime Number");

    }
       else {
           System.out.println("prime Number");
           return;
       }
   
     
     return;
}

public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt() ;

    numbers(n);

}
}
