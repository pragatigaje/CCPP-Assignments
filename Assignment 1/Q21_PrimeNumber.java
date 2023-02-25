public class Q21_PrimeNumber {
    public static void main(String[] args) {
        int num = 77;
        boolean flag = true;

        for(int i = 2 ; i < num/2 ; i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not a prime number");
                flag=false;
                break;
            }
        }

        if(flag==true)
        System.out.println(num+" is a prime number");
    }
}
