package strings;

public class StringLearn {

    public static void main(String[] args) {
           String s = "Ashish"; // Non-Mutable String
           s = s+ "asdf"; //new object of s+"asdf" created in heap(string constant pool) and assigned
           System.out.println(s);

           StringBuffer sb = new StringBuffer("Ashish"); //thread safe mutable string(vector/array of character with buffer space)
           System.out.println(sb);
           sb.append(" Gupta"); //same object can be mutated because it has capacity
           System.out.println(sb);

           StringBuilder sbd = new StringBuilder("Ashish "); //same as string buffer but no thread safe
           System.out.println(sbd);
    }
}
