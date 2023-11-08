package accesstutorial.mainpackage;

// By default, when no access modifier is specified,
// they have package-private visibility, which means they are accessible within the same package.
//So if this class is not public can't be accessed outside the package

//top level classes cannot be declared private/protected
//they are either public or default
// Human is default
class Human {
    String age;
}
