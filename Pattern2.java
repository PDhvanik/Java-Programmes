public class Pattern2 {
    public static void main(String args []) {
       int n=5;
       int k=1;
       
       for (int i=1;i<=n;i++) {
        for (int j=1;j<=i;j++) {
            
            System.out.print(k++);
        }
        System.out.println();

       }
       
    } 
}
