package Java8;
// Lambda expressions are used to define anonymous methods in Java.
// They are used to provide the implementation of the abstract method of a functional interface. 
// They are similar to methods, but they do not need a name and can be implemented right in the body of a method.

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

@FunctionalInterface
interface GreetingService {
    void sayMessage(String message);
}

// Not a Functional Interface
interface Vehicle {
    void horn();

    void drive();
}

// abstract class with single abstract method
abstract class Bird {
    abstract void fly();
}

public class LambdaExpressionsDemo {
    public static void main(String args[]) {

        // Lambda expression for addition
        MathOperation addition = (int a, int b) -> a + b;

        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // Lambda expression for division
        MathOperation division = (int a, int b) -> a / b;

        // Lambda expression for greeting
        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        greetService1.sayMessage("John");

        // Lambda expression with multiple statements
        GreetingService greetService2 = (message) -> {
            System.out.println("Hey " + message);
            System.out.println("Welcome to lambda expressions");
        };
        greetService2.sayMessage("Doe");

        // Using the lambda expressions
        System.out.println("10 + 5 = " + addition.operate(10, 5));
        System.out.println("10 * 5 = " + multiplication.operate(10, 5));
        System.out.println("10 - 5 = " + subtraction.operate(10, 5));
        System.out.println("10 / 5 = " + division.operate(10, 5));

        // Vehicle v = () -> System.out.println("Horn is working"); // Error: Vehicle is
        // not a functional interface
        // Bird b = () -> System.out.println("Bird is flying"); // Error: Bird is not a
        // functional interface

        // LAMBDA EXPRESSION IS ONLY FOR FUNCTIONAL INTERFACE, NOT FOR ABSTRACT CLASS
        // EVEN IF IT HAS SINGLE ABSTRACT METHOD

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.forEach(n -> System.out.print(n+" ")); 
        // One time implementation of lambda expression inside foreach method without even creating reference to lambda expression
    }

}