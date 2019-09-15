package Practices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
        HashSet<Integer> b = new HashSet(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        System.out.println("Element of a: "+ a);
        System.out.println("Element of b: "+ b);

        HashSet<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union set of a and b : "+ union);

        HashSet<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of a and b : "+ intersection);

        HashSet<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference of a and b : "+ difference);

        TreeSet<Integer> tree_set = new TreeSet<>(a);
        System.out.println(tree_set);
    }
}
