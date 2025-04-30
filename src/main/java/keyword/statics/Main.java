package keyword.statics;
//Static Imports
//Allows importing static members of a class so they can be accessed without the class name.
import java.util.Arrays;

import static java.lang.Math.*;

class Example {

    //Static Variables
    //Declared at the class level and shared across all instances of the class.

    static int counter = 0;
//    Arrays.asList(2,3,4)
    Example() {
        counter++;
    }
}

class Utility {

//    Static Methods
//    Methods that belong to the class and can be invoked without creating an instance.
//    Cannot directly access non-static members of the class.

    static int add(int a, int b) {
        return a + b;
    }
}

class Example2 {

//    Static Blocks
//    Used to initialize static variables or perform actions during class loading.
//    Executed once when the class is loaded into memory.
    static int value;

    static {
        value = 42;
        System.out.println("Static block executed");
    }
}


class OuterClass {
    private String message = "Hello from Outer Class!";

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Hello from Static Nested Class!");
        }
    }

    // Non-static nested class (Inner class)
    class InnerClass {
        void display() {
            System.out.println("Message from Outer Class: " + message);
            System.out.println("Hello from Inner Class!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //The static keyword in Java is a powerful feature that is widely used to manage memory efficiently
        // and define members that belong to the class rather than to instances of the class

        new Example();
        new Example();
        System.out.println(Example.counter); // Outputs: 2
        System.out.println(Utility.add(5, 10)); // Outputs: 15
        System.out.println(Example2.value); // Outputs: 42

        // Create an object of the static nested class
        OuterClass.StaticNestedClass staticNestedObj = new OuterClass.StaticNestedClass();
        staticNestedObj.display();

        // Create an object of the inner class
        OuterClass.InnerClass innerObj = new OuterClass().new InnerClass();
        innerObj.display();

        System.out.println(sqrt(16)); // Outputs: 4.0
    }
}
