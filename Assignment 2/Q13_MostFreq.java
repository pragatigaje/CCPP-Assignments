public class Q13_MostFreq {
    public static void main(String[] args) {
        int[] arr = {10,44,12,44,15,16,18,78,44,16,16,16};
        int mf = 0;
        int maxcount = 0;

        for(int i = 0; i < arr.length ; i++)
        {
            int count = 0;
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>maxcount)
                mf=arr[i];
        }

        System.out.println("The most frequent element "+mf);
    }
}
