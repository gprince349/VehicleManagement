package interfaces;


//In Java, an interface is a blueprint for a class, similar to a class,
// but it only contains method signatures and constant (final) fields.
// Unlike classes, interfaces cannot be instantiated, but they can be implemented by classes.
// When a class implements an interface, it must provide concrete implementations for all the methods declared in that interface.

public interface Engine {
        void start();
        void stop();

        // Default methods have method bodies and are used to provide default implementations
        // for methods in an interface. Classes that implement the interface are not required
        // to override default methods unless they need to.
        default void emergencyStop() {
                // Default implementation for an emergency stop
                System.out.println("default emergency stop..");
        }
}
