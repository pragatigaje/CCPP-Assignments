import java.util.Arrays;

public class Q11_ZeroAtStart {
    public static void main(String[] args) {
        int[] arr= {10,0,20,0,30,40,50,0};
        int[] dest = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=0)
            {
                dest[count++]=arr[i];
            }
        }

        System.out.println(Arrays.toString(dest));

    }
}
