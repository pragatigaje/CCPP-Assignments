import java.util.Arrays;

public class Q14_MostFreqSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        boolean check = true;
        int mf = 0;
        int maxcount = 0;

            for(int i = 0 ; i < arr.length ; i++)
            {
                int count = 1;
                while(check==true)
                {
                    if(arr[i]==arr[i+count])
                    {
                        check=true;
                        count++;
                    }
                    else
                    {
                        break;
                    }
                }
                if(count>=maxcount)
                    mf=arr[i];
            }

        System.out.println("The most frequent element is : "+mf);
    }
}
