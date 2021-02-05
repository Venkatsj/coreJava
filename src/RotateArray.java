public class RotateArray {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int n = 8;
        RotateArray arr = new RotateArray();
        for(int i = 0; i < n-1 ;i ++) {
            arr.rotateArray(array);
        }

        for(int i : array)
            System.out.println(i+",");
    }

    private void rotateArray(int[] array){
        int temp = array[0], i;
        for(i = 0 ; i<array.length-1 ; i++)
            array[i] = array[i+1];
        array[i] = temp;
    }

    /*public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int n = 3;
        int[] tempArray = new int[n-1];
         for (int i = 0; i <= n-2; i++){
             tempArray[i] = array[i];
         }
         int k = 0;
         for (int j=0; j<array.length; j++){

             if(j < n && n-1+j < array.length) {
                 array[j] = array[n - 1 + j];
             }
             else {
                 array[j] = tempArray[k];
                 k++;
             }
         }

         for(int i : array)
         System.out.println(i+",");
    }*/

}
