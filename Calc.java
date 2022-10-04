
    import java.util.*;
 
    public class Calc {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of 1st No. :");
       int a = sc.nextInt();
       System.out.println("Enter the value of 2nd No. :");
       int b = sc.nextInt();
       System.out.println("Press this Integer for your Oprator:\n1--> +\n2--> - \n3--> *\n4--> / \n5 -> %");
       int operator = sc.nextInt();
 
       
 
       switch(operator) {
           case 1 : System.out.println("Your Addition is "+ a+b);
           break;
           case 2 : System.out.println("Your Sbstraction is ");
           System.out.println(a-b);
           break;
           case 3 : System.out.println("Your Multiplication is "+a*b);
           break;
           case 4 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println("Your Devision is "+a/b);
                   }
	    break;
           case 5 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println("Your Reminder is "+a%b);
                   }
	    break; 
           default : System.out.println("Invalid Operator");
       }
   }
}


