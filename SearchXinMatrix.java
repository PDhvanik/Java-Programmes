import java.util.*;
public class SearchXinMatrix {
    public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int rows=sc.nextInt();
       int cols=sc.nextInt();

       int[][] Matrix= new int[rows][cols] ;


       for (int i=0;i<rows;i++) {
           for (int j=0;j<cols;j++) {
              Matrix[i][j]=sc.nextInt();
            }
        }        
            
            int X=sc.nextInt();
            for (int i=0;i<rows;i++) {
                for(int j=0;j<cols;j++) {
                    if (X==Matrix[i][j]) {
                        System.out.println("X Found at location: "+ i + "," + j);
                    }

                }
            }
                
            
       
    }

    
}
