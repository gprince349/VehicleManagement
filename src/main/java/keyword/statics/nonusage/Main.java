package keyword.statics.nonusage;

//Where static Cannot Be Used


//Static methods cannot be overridden but can be hidden.
class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() { // Hiding, not overriding
        System.out.println("Child static method");
    }
}


public class Main {

    //static cannot be applied to variables declared inside a method.
    void someMethod() {
//         static int localVar = 10; // Compilation Error
    }

    //You cannot declare method parameters as static.
//    void display(static int value) { // Compilation Error
//    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.show(); // Outputs: Parent static method
        //here the child method didnt override so thats why parent method is called
        //it is only hiding

        Child c = new Child();
        c.show();
        Parent.show();
        Child.show();
    }
}
