import java.util.HashSet;
import java.util.Set;

public class Q5_IntersectionOfArray {
    public static void main(String[] args) {
        Integer[] arr1 = {14,25,64,12,45,36};
        Integer[] arr2 = {14,33,22,89,45,36};

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length ; i++)
        {
            set.add(arr1[i]);
        }

        System.out.println("Intersection of 2 arrays : ");
        for(int i=0; i<arr2.length ; i++)
        {
            if(!set.add(arr2[i]))
            {
                System.out.print(arr1[i]+" ");
            }
        }

    }

}
