import java.util.*;
public class ReverseMatrix {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of Matrix Size: ");
        int rows=sc.nextInt();
        int cols=rows;

        int[][] Matrix=new int [rows][cols];
        System.out.println("Enter Your Matrix");
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
               
              Matrix [i][j]=sc.nextInt();
              
            }
        }
        System.out.println("Reverse Matrix is:");
        for(int i=rows-1;i>=0;i--) {
            for (int j=cols-1;j>=0;j--) {
                 System.out.print(Matrix[i][j] + " ");
            }
           System.out.println("");
        }
    }
}
