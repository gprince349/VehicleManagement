package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewMap {

    public static void main(String[] args) {
        Map<Integer,String> idToGoods = new HashMap<>();

        idToGoods.put(1, "Ashish");
        idToGoods.put(2, "Jeet");
        idToGoods.put(3, "Satyam");

        Set<Integer> keySet = idToGoods.keySet();
        keySet.remove(1);

        System.out.println(idToGoods);
    }
}
