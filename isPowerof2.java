import java.util.*;
public class isPowerof2 {
     public static void main(String args[]) {
          Scanner sc=new Scanner(System.in) ;
          int n=sc.nextInt();
          int b=2;
           for (int i=0;i<n;i++){
            if (n==b){
                    System.out.println("The Number is Power of 2.");
               }
               
               b=b*2;
           }
           

               
          
           
           
     }
}
