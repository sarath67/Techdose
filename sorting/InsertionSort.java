public class InsertionSort {
    public static void main(String[] args) {
        int[] b = {42, 11, 35, 9, 23};
        
        for (int i=1;i<b.length;i++) {
            int c=b[i];
            int d=i-1;
            while(d >= 0 && b[d] > c) {
                b[d+1] = b[d];
                d--;
            }
            b[d+1]=c;
        }
        
        for(int i=0;i<b.length;i++) {
            System.out.print(b[i]+" ");
        }
    }
}
