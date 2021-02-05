package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class SteamsTest {
    public static void main(String[] args){

        Collection<String> list = Arrays.asList("vijay", "kiran", "sandeep", "santhosh", "krishna");

        list.stream().filter(a -> a.startsWith("s")).forEach(s -> System.out.println(s));

        System.out.println(list.stream().anyMatch(a ->a.startsWith("v")));

        list.stream().filter(Predicate.isEqual("vijay")).forEach(a -> System.out.println(a));

        Predicate<String> p = a -> a.startsWith("v");

        list.stream().filter(p.and(a->a.equals("vijay"))).forEach(a -> System.out.println(a));
    }
}
