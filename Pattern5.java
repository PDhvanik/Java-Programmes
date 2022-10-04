public class Pattern5 {
    public static void main(String args[]) {
        int n=5;
        for(int i=n;i>=1;i--) {
            int  space = i - 1;
            for (int j=1;j<=space;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++) {
                System.out.print("*");
            }
                System.out.println();
        }

    }
}
