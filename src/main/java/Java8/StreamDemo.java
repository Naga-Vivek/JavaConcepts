package Java8;

import java.util.*;
import java.util.stream.*;;

public class StreamDemo{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(32,45,12,87,31,55,29,38,67,46,72,57,78);
        System.out.println(list);
        List<Integer> li1 = list.stream().filter((x)->x%2==0).collect(Collectors.toList());
        System.out.println(li1);
        List<Integer> li2 = list.stream().map((x)->x+x).collect(Collectors.toList());
        System.out.println(li2);

        Optional<Integer> res = list.stream().reduce((a,b)->a+b);
        System.out.println(res.get());

        int reducedParam1 = Arrays.asList(1,2,3).stream().reduce(10,(a,b)->a+b , (a,b)->a-b);
        System.out.println(reducedParam1);
        int reducedParam2 = Arrays.asList(1,2,3).parallelStream().reduce(10,(a,b)->a+b , (a,b)->a+b);
        System.out.println(reducedParam2);
        IntSummaryStatistics stats = IntStream.range(1,10).summaryStatistics();
        System.out.println(stats);
    }
}