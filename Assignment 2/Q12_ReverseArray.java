public class Q12_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,12,14,21,99,84,75,65};
        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        
    }
}
