package Java8;

import java.util.*;
import java.util.stream.*;;

public class StreamDemo2{
    public static void main(String args[]){
        List<Integer> l1 = Arrays.asList(1,2,3,4);
        List<Integer> l2 = Arrays.asList(5,6,7);
        List<Integer> l3 = Arrays.asList(8,9,10);

        List<List<Integer>> list = Arrays.asList(l1,l2,l3);

        List<Integer> res = list.stream().flatMap(lst->lst.stream()).map(x->x+x).collect(Collectors.toList());
        System.out.println(res);
        
    }
}