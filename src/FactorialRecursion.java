public class FactorialRecursion {
    static int result = 1;
    public static void main(String[] args){

        int k = 10;
        System.out.println(recursive(k));
    }

    public static int recursive(int j){
        if(j > 0)
        return j * recursive(j-1);
        else return 1;
    }
}
