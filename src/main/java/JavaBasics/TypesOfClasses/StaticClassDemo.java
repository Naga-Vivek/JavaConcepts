package JavaBasics.TypesOfClasses;

// Outer class
class OuterClass {
    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Non-Static method inside the static nested class.");
        }

        static void staticMethod() {
            System.out.println("Static method inside the static nested class.");
        }
    }
}
class StaticClassDemo {
    public static void main(String[] args) {
        // Instantiating the static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

        // Calling a non-static method of the static nested class
        nestedObject.display();

        // Calling a static method of the static nested class
        OuterClass.StaticNestedClass.staticMethod();
    }
}