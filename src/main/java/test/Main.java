package test;

public class Main {

    public static void main(String[] args) {


        // insert -> int n ,
        // delete -> int val,
        // search -> int val,
        // get a random element
        // O(1)

        // LL : val
        // HashMap ; val as key -> reference to the LL item

        DS ds = new DS();
        // 3,4,5,2,3

        ds.insert(3);
        ds.insert(4);
        ds.insert(10);
        ds.insert(11);
        ds.insert(13);
        ds.insert(16);
        ds.insert(1);

        System.out.println(ds.search(10));
        ds.delete(10);
        System.out.println(ds.search(10));

        System.out.println(ds.getRandomELement());

    }
}


