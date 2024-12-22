package Java8;

import java.util.*;
import java.util.function.*;
public class ForEachDemo{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(11,22,33,44,55);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------");

        Iterator<Integer> i2 = list.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
        System.out.println("--------");
        for(int x:list){
            System.out.println(x);
        }
        System.out.println("--------");

        Consumer<Integer> c1 = (val)->System.out.println("<< "+val+" >>");
        list.forEach(c1);
        System.out.println("--------");

        list.forEach((val)->System.out.println(val));
        list.forEach(System.out::println);

    }
}