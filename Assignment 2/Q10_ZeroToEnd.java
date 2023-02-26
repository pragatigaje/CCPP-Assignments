import java.util.Arrays;

public class Q10_ZeroToEnd {
    public static void main(String[] args) {
        int[] arr= {10,0,20,0,30,40,50,0};
        int z=0;
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)
            {
                arr[z]=arr[i];
                z++;
            }
        }
        while(z<arr.length)
        {
            arr[z]=0;
            z++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
