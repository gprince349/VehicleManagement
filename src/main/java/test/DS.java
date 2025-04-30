package test;

import java.util.*;

public class DS {

    private final List<Integer> items;
    private final Map<Integer, Integer> map;

    public DS(){
        items = new LinkedList<>();
        map = new HashMap<>();
    }

    public void insert(int val){
        items.add(val);
        Integer position = items.size()-1;
        map.put(val, position);
    }

    public boolean delete(int val){
        if(map.containsKey(val)){
            items.remove(map.get(val));

            map.remove(val);
            return true;
        }else{
            return false;
        }
    }

    public boolean search(int val){
        return map.containsKey(val) ? true: false;
    }

    public Integer getRandomELement(){
        int rand = (int) (Math.random()*items.size());
        return items.get(rand);
    }

}
