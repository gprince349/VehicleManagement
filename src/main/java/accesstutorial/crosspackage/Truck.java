package accesstutorial.crosspackage;

import accesstutorial.mainpackage.Vehicle;

//When a variable is declared as protected, it can be accessed within the same class,
// within other classes in the same package, and within subclasses of the class,
// regardless of whether they are in the same package or not.

public class Truck extends Vehicle {

    public void accessCheck(){
//        System.out.println(this.manufacturer); package-private not accessible outside package
        System.out.println(this.model);
        System.out.println(this.year);//protected var can be acceses in child outside package

        this.publicMethod();
//        vehicle.internalMethod(); private no access
        this.protectedMethod(); //same-package access or subclass
//        this.defaultMethod(); //package-private
    }
}
