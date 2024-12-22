package JavaBasics.TypesOfClasses;

// Utility Class
final class MathUtils {
    // Private constructor to prevent instantiation
    private MathUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }

    // Static method to calculate the factorial of a number
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Static method to find the maximum of two numbers
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}

// Main class to demonstrate the Utility Class
public class UtilityClassDemo {
    public static void main(String[] args) {
        // Using the utility methods
        System.out.println("Square of 5: " + MathUtils.square(5));       // Output: 25
        System.out.println("Factorial of 4: " + MathUtils.factorial(4)); // Output: 24
        System.out.println("Maximum of 10 and 20: " + MathUtils.max(10, 20)); // Output: 20

        // Uncommenting the following line will cause an error due to private constructor
        // MathUtils mathUtils = new MathUtils();
    }
}
