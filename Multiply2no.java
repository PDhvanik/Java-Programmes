import java.util.*;
public class Multiply2no {
    public static int multiplyNum (int i,int j) {
       int  n=i*j;
       System.out.println(n);
       return n;
      
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);
        System.out.println("First No.:");
        int i= sc.nextInt() ;
        System.out.println("Second No.:");
        int j=sc.nextInt() ;
        
        multiplyNum(i,j) ;

       
        
    }
}
