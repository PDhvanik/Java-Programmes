public class ClearBit {
    public static void main (String args[]) {
        int n=5;//0101
        int pos=2;
        int BitMask=1<<pos;
        int newBitMask= ~(BitMask) ;
        
        int newNum= newBitMask & n;
        System.out.println(newNum);
        
    }

}
