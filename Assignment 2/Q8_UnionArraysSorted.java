import java.util.*;
public class Q8_UnionArraysSorted {
    public static void main(String[] args) {
        int[] a1 = {10,40,64,41,25};
        int[] a2 = {99,45,62,40,45};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a1.length; i++) {
            set.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            set.add(a2[i]);
        }

        System.out.println(set);
    }
}
