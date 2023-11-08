package accesstutorial.mainpackage;

// Public: Public access modifier is the least restrictive. Public members are accessible from anywhere,
// including other classes, packages, and even outside the application. You can access public members using the dot operator (.).
//
// Private: Private access modifier is the most restrictive. Private members are accessible only
// within the same class. They are not visible to other classes, including subclasses.
// Private members are typically used to encapsulate internal implementation details.
//
// Protected: Protected access modifier allows access within the same class, subclasses, and other
// classes in the same package. Protected members are not accessible to classes in different packages,
// except for subclasses. Protected members provide more visibility than private but less visibility than public.
//
// Default (Package-private): If no access modifier is specified, the member has default access.
// Default access allows access within the same class and other classes in the same package.
// Default members are not accessible from classes in different packages, including subclasses.


//It's worth noting that there can only be one public class per Java source file,
// and the file name should match the name of the public class. However,
// multiple classes with default access can exist in the same file.

public class Vehicle {
    String manufacturer;
    public String model;
    private String chessisNumber;
    protected int year;

    public void publicMethod(){

    }

    private void internalMethod() {
        // Private method logic
    }

    protected void protectedMethod() {
        // Protected method logic
    }

    void defaultMethod() {
        // Default (Package-private) method logic
    }
}
