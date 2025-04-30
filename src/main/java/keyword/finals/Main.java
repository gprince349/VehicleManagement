package keyword.finals;

class Example2 {

    //Static Variables: Must be initialized at the time of declaration or in a static block.
    static final int STATIC_VALUE;

    static {
        STATIC_VALUE = 42; // Allowed
    }
}


class Example {

    //Instance Variables: Can be initialized when declared or in the constructor, but not reassigned afterward.
    final int value;

    Example(int value) {
        this.value = value; // Allowed during constructor execution
    }

    void modify() {
//         value = 20; // Compilation Error
    }
}

//A method declared as final cannot be overridden by subclasses. This is useful for preventing
// a specific implementation from being changed.
class Parent {
    final void display() {
        System.out.println("Final method in Parent");
    }
}

class Child extends Parent {
    // void display() {} // Compilation Error: Cannot override the final method
}

//Final Classes
//A class declared as final cannot be extended. This is typically used to create
// immutable classes or to prevent subclassing for security or design reasons.
final class Example3 {
    void display() {
        System.out.println("Cannot extend this class");
    }
}

// class Subclass extends Example3 {} // Compilation Error: Cannot inherit from final class


public class Main {
    //The final keyword in Java is used to enforce constraints on variables, methods, and classes.
    // Depending on where it is applied, it has different meanings and usage rules. Below is a
    // detailed breakdown of the final keyword.

    //Final Variables
    //A variable declared as final cannot be reassigned once it has been initialized.
    // However, the way initialization happens depends on the type of variable.

    public static void main(String[] args) {
        //Local Variables: Must be initialized before use and cannot be reassigned
        final int x = 10;
        // x = 20; // Compilation Error: Cannot assign a value to final variable 'x'


    //References: If a reference variable is final, the reference itself cannot be reassigned,
        // but the object it points to can be modified.
        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Allowed
        // sb = new StringBuilder(); // Compilation Error
    }
}
