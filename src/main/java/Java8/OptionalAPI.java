package Java8;

import java.util.*;
public class OptionalAPI{
    public static void main(String args[]){
        Integer a  = 30;
        Integer b = 67;
        Optional<Integer> o1  = Optional.ofNullable(a);
        Optional<Integer> o2  = Optional.ofNullable(b);
        add(o1,o2);
    }
    public static void add(Optional<Integer> a , Optional<Integer> b){
        Integer i1 = a.orElse(0);
        Integer i2 = b.orElse(0);

        System.out.println("Result: "+(i1+i2));
    }
}