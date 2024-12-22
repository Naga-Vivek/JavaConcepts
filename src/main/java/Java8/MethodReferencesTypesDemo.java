package Java8;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
class Example {
    public static void printMessage(String message) {
        System.out.println(message);
    }
    boolean greet(int year){
        System.out.println("Reference to an instance method of a particular object");
        return year%4==0;
    }
}
class Example2{
    Example2(){
        System.out.println("Reference to a Constructor");
    }
}
public class MethodReferencesTypesDemo {
    public static void main(String[] args) {
    // Types of Method References
    // 1. Reference to a static method
        Consumer<String> c = Example::printMessage;
        c.accept("Reference to a static method");
        System.out.println();
    // 2. Reference to an instance method of a particular object
        Example e = new Example();
        Predicate<Integer> p = e::greet;
        System.out.println(p.test(2025)? "Leap Year" : "Not a Leap Year");
        System.out.println();

    // 3. Reference to an instance method of an arbitrary object of a particular type
        UnaryOperator<String> f = String::toUpperCase;
        System.out.println(f.apply("Reference to an instance method of an arbitrary object of a particular type"));
        System.out.println();
        Function<String, Integer> f1= String::length;
        System.out.println("Length of above string is "+f1.apply("Reference to an instance method of an arbitrary object of a particular type"));
        System.out.println();
        BinaryOperator<Integer> f2 = Integer::sum;
        System.out.println("Sum is "+f2.apply(10, 20));
    // 4. Reference to a constructor
        Supplier<Example2> s = Example2::new;
        s.get();
    }
}


