import java.util.*;
public class Transposematrix {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Matrix, ");
        System.out.print("Rows: ");
        int rows=sc.nextInt();
        System.out.print("Cols: ");
        int cols=sc.nextInt();

        int[][] Matrix=new int [rows][cols];
        System.out.println("Enter Your Matrix");
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
               
              Matrix [i][j]=sc.nextInt();
              
            }
        }
        System.out.println("Transpose Matrix is:");

       for (int j=0;j<cols;j++) {
        for (int i=0;i<rows;i++) {
            System.out.print(Matrix[i][j] + " ");
        }
        System.out.println();
       }
        
    }
}
