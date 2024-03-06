package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2% 10) return 1;
                else return  -1;
            }
        };

        Comparator<Integer> comp2 = (o1, o2) -> {
            if (o1 % 10 > o2 % 10) return 1;
            else if (o1 % 10 == o2 % 10) return 0;
                else return -1;
        };

        //use of Function as FI
        Function<Integer, String> F = (x)-> "Ashish";

        System.out.println(F.apply(23));

        List<Integer> nums = new ArrayList<>();
        nums.add(19);
        nums.add(22);
        nums.add(11);
        nums.add(34);

        //Collections are set of polymorphic algorithms i.e. Binary search, sort, min, max all works on collections
        Collections.sort(nums);
        System.out.println(nums);

        //sort using comparator based on last digit
        Collections.sort(nums, comp);
        System.out.println(nums);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(23, "Ashish"));
        studs.add(new Student(18, "anil"));
        studs.add(new Student(26, "abhishek"));

        for(Student s: studs)
            System.out.println(s);

        System.out.println("#########################");
        Collections.sort(studs);

        for(Student s: studs)
            System.out.println(s);
    }
}
