public class SelectionSort {
    public static void main(String[] args) {
        int[] x = {29, 14, 3, 55, 21};
        for (int i=0;i<x.length-1;i++) {
            int y = i;
            for (int j=i+1;j<x.length;j++) {
                if (x[j]<x[y]) {
                    y=j;
                }
            }
            int z=x[y];
            x[y]=x[i];
            x[i]=z;
        }
        
        for (int i=0;i<x.length;i++) {
            System.out.print(x[i]+" ");
        }
    }
}
