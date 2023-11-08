package accesstutorial;

//import accesstutorial.mainpackage.Human;
import accesstutorial.mainpackage.Vehicle;

public class MainOutPackage {
    public static void main(String[] args) {
//        Human human = new Human(); can't access package-private class

        Vehicle vehicle = new Vehicle();
//        System.out.println(vehicle.manufacturer); //package-private default access
        System.out.println(vehicle.model); //public
        // System.out.println(vehicle.chessisNumber); no private var access
        //System.out.println(vehicle.year); // protected in same package acess

        vehicle.publicMethod();
//        vehicle.internalMethod(); private no access
//        vehicle.protectedMethod(); //same-package access or subclass
//       vehicle.defaultMethod(); //package-private
    }
}
