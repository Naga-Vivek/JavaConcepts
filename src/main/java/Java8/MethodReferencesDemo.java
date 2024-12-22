package Java8;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.concurrent.Callable;

class Number{
    public static boolean isEven(int n){
        return n%2==0;
    }
    
    public static Integer getNumber() {
        return 42;
    }
    String getInfo(){
        return "This is a Number Class";
    }
    void printNumber(){
        System.out.println("Using Runnable Interface");
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
public class MethodReferencesDemo {
    public static void main(String args[]){
        // For Consumer Interface
        Consumer<String> c = System.out::println;
        c.accept("Using Consumer Interface");
        Arrays.asList("a", "b", "c").forEach(c);

        // For Function Interface
        Function<String, String> c1 = String::toUpperCase;
        System.out.println(c1.apply("using Function Interface"));
        Function<String, Integer> c2 = String::length;
        System.out.println(c2.apply("using Function Interface"));

        // For Predicate Interface
        Predicate<String> c3 = String::isEmpty;
        System.out.println("using Predicate  Interface : Empty String Test returns "+c3.test("Vivek"));
        Predicate<Integer> c4 = Number::isEven;
        System.out.println("using Predicate  Interface : Even Number Test returns "+c4.test(10));

        // For Unnary Operator
        UnaryOperator<String> c5 = String::toLowerCase;
        System.out.println(c5.apply("Using Unary Operator in  BANGALORE"));

        // For Binary Operator
        BinaryOperator<Integer> c6 = Integer::sum;
        System.out.println("Using Binary Operator , Sum of 12 and 20 is "+c6.apply(12, 20));
        
        // For Supplier Interface
        Number n = new Number();
        Supplier<String> s = n::getInfo;
        System.out.println("Using Supplier Interface , "+ s.get());

        // For Runnable Interface
        Runnable r = n::printNumber;
        new Thread(r).start();

        // For Callable Interface
        Callable<Integer> c7 = Number::getNumber;
        try {
            System.out.println("Using Callable Interface , "+ c7.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
