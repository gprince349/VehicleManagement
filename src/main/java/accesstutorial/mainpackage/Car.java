package accesstutorial.mainpackage;

public class Car extends Vehicle{

    public void accessCheck(){
        System.out.println(this.manufacturer);
        System.out.println(this.model);
        System.out.println(this.year);
    }
}
