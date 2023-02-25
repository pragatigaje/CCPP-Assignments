public class Q3_SecondMin {
    public static void main(String[] args) {
        int[] arr = {1,45,74,44,85,41,23,25};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] =  temp;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }
}
