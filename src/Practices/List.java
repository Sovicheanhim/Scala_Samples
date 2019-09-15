package Practices;

import java.util.Arrays;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList(Arrays.asList("A", "B", "C", "D", "E", "F", "Z", "M"));
        System.out.println("LinkedList element : "+ list);

        list.addFirst("N");
        list.addLast("P");
        System.out.println("LinkedList after insertion : "+list);

        list.remove(3);
        list.removeFirst();
        System.out.println("LinkedList after remove : "+ list);

        System.out.println("LinkedList contains \"A\" : "+ list.contains("A"));

        System.out.println("Size of LinkedList : " + list.size());

        list.set(2, "I");
        list.set(4, "T");
        System.out.println("LinkedList after change : "+ list);
    }
}
