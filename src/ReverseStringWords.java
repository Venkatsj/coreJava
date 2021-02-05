public class ReverseStringWords {
    public static void main(String[] args){
        String input = "All Is Well";
        String[] sArray = input.split(" ");
        for(int i = sArray.length -1 ; i >= 0; i--){
            System.out.print(sArray[i]+" ");
        }
    }
}
