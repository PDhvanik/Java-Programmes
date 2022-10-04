public class Bubleshorting {
    public static void printArr(int series[]){
        for(int i=0;i<series.length;i++) {
            System.out.print(series[i]+ " ");
        }
         
    }
    public static void main(String args []) {
         int series[]= {3,6,4,9};
         for(int i=0;i<series.length-1;i++) {
            for(int j=0;j<series.length-i-1;j++) {
               if (series[j]>series[j+1]) {
                    int empty=series[j];
                    series[j]=series[j+1];
                    series[j+1]=empty;
               }
            }
        }
         printArr(series);
    }
}
