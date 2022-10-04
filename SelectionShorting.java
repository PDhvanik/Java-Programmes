public class SelectionShorting {
    public static void print(int arr[] ) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]) {
        int arr[]= {9,1,5,2,6} ;

        for(int i=0;i<arr.length-1;i++) {
            int smallest=arr[i];
            
                for(int j=i+1;j<arr.length;j++) {
                    if (arr[j]<smallest) {
                          smallest=arr[j];

                    }
                    int temp=smallest;
                    smallest=arr[i];
                    arr[i]=temp;
                }
                
                    
        }
        
        print(arr);
    }
}
