import java.util.Scanner;

public class Calculator
 {public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Value 1=");
       int a=sc.nextInt();
       System.out.println("Enter the Value 2=");
       int b=sc.nextInt();
       int Addition=a+b;
       int Sbstraction=a-b;
       int Multiplication=a*b;
       int Division=a/b;
       int Module=a%b;
       System.out.println("Addition="+Addition);
       System.out.println("Sbstraction="+Sbstraction);
       System.out.println("Multiplication="+Multiplication);
       System.out.println("Division="+Division);
       System.out.println("Module="+Module);
    }
    
 }