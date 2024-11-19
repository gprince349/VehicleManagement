package collections;

import java.util.*;

public class PlayWithCollection {

    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Map map = new HashMap<>();

        List<String> person = new ArrayList<>();
        person.add("ashish");
        person.add("jeet");
        person.add("bansal");

        //unmodifiable
        List<String> personView = Collections.unmodifiableList(person);
//      personView.add("new person");   throws exception

        System.out.println(personView);
        person.add("new person"); // underlying object can change 
        System.out.println(personView);

        //immutable
        List<String> immutable = List.of("a", "b");
//        immutable.add("new"); // throws exception
    }


}




