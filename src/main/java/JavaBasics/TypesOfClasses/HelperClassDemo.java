package JavaBasics.TypesOfClasses;

// Helper class
class StringHelper {
    private String str;

    // Constructor
    public StringHelper(String str) {
        this.str = str;
    }

    // Non-static method
    public String getReversed() {
        return new StringBuilder(str).reverse().toString();
    }

    // Static method
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}

// Main class
public class HelperClassDemo {
    public static void main(String[] args) {

        // Using the helper methods
        StringHelper helper = new StringHelper("World");
        System.out.println(helper.getReversed()); // Output: dlroW

        System.out.println(StringHelper.isNullOrEmpty("")); // Output: true

    }
}
