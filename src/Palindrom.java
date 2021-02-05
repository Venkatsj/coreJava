public class Palindrom {

    public static void main(String[] args){
        int num= 101;
        int num1 = num;
        int revNum = 0;
        int remainder = 0;

        do{
            remainder = num%10;
            revNum = revNum*10 + remainder;
            num = num/10;
        }while (num>0);

        System.out.println(num1 == revNum);

    }
}
