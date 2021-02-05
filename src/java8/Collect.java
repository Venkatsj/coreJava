package java8;


import java.util.stream.*;
import java.util.*;

public class Collect
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("one", "two", "three", "four","four");
        ArrayList<String> stream1 = new ArrayList<>();
        stream1.add("four");

        List<String> a = stream.filter(st -> stream1.stream().anyMatch(s -> s.contains(st))).collect(Collectors.toList());

        System.out.println(a);      //true
    }
}
