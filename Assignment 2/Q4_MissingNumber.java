public class Q4_MissingNumber {

    public static boolean contains(int[] arr, int key)
    {
        boolean res = false;
       for (int i = 0; i < arr.length; i++) 
       {
         if(key==arr[i])
            res = true;
       }
       return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,12,45,12,16,17,22,96,1,4,5,6};
        int n = 20;
        for(int i = 1 ; i < n ; i++)
        {
            if(contains(arr, i))
                System.out.println(i);
        }
    }
}
