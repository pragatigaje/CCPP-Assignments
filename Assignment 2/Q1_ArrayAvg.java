public class Q1_ArrayAvg {
    public static void main(String[] args) {
        int[] arr = {10,20,65,47,58,65};
        int sum=0, avg =0;

        for(int i =0; i<arr.length; i++)
        {
            sum+=arr[i];
        }

        avg=sum/arr.length;
        System.out.println(avg);
    }
}
