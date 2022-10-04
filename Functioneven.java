import java.util.*;
public class Functioneven {
    public static void numbers(int n) {
        if(n%2==0) {
            System.out.println("Even Num.");
        }
        else {
          System.out.println("odd Num.");
        }
        return;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in) ;
        int n=sc.nextInt();
        numbers(n);
        
    
    }
     
}
