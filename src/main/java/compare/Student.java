package compare;

public class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1;
        }else if(this.age < o.age){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
