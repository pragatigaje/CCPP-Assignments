public class Q5_IntersectionOfArray {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50,60};
        int [] arr2 = {10,40,50,60};

        for(int i=0; i<arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr2[j]);
                }
            }
        }
    }

}
