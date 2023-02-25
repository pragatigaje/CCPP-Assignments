import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q2_SecondLargest {

    public static int largest(int[]arr)
    {
        int largest = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(largest<arr[i])
                largest=arr[i];
        }

        return largest;
    }

    public static int SecondLargest(int[] arr)
    {
        int second_largest = 0;
        
        for(int i =0; i< arr.length-1 ; i++)
        {
            for(int j = 1 ; i < arr.length ; i++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                }
            }

        }
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        Integer[] arr = {10,95,30,40,50,88,125,44};
        
        //System.out.println(largest(arr));
        //System.out.println(SecondLargest(arr));

        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        int total = arr.length;
        System.out.println(list.get(total-2));

    }
}
