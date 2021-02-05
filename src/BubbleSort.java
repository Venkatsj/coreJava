public class BubbleSort {

    public static void main(String[] args){
        int[] a = new int[]{10,3,6,2,10,7,13};

        for(int j = 0; j<a.length-1; j++) {
            for (int i = 0; i < a.length-j-1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }

       /* for(int i = 0; i<a.length; i++)
            System.out.println(a[i]+" ");*/

        for(int j = 0; j<a.length-1; j++){
            if (a[j] == a[j+1]) {
                for(int i = j+1; i < a.length-1; i++){
                    a[j+1]=a[j+2];
                }
            }
        }

        for(int i = 0; i<a.length-1; i++)
            System.out.println(a[i]+" ");
    }
}
