package java8;

import java.util.function.Consumer;
import java.util.function.IntFunction;

public class LambdaBasic {
    public static void main(String[] args){
        Calculate add = (a,b) -> a+b;
        Calculate multiply = (a,b) -> a*b;
        //Consumer<Integer> num = add::math(a,b);

        System.out.println("4+5 = "+ add.math(4,5));
        System.out.println("4*5 = "+multiply.math(4,5));
    }
}


@FunctionalInterface
interface Calculate{
    public int math(int a , int b);
    default void inst(){
    }
}