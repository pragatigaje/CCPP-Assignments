public class Q18_LCMUsingPrimeFactors {
    public static void main(String[] args) {
        int n1 = 40, n2 = 210;
        int lcm = 1;
        for (int i = 2 ; i< n1 ; i++)
        {
            while(n1!=0)
            {
                if(n1%i==0)
                {
                    n1/=i;
                    lcm*=i;
                }
            }
        }

        for (int i = 2 ; i< n2 ; i++)
        {
            while(n2!=0)
            {
                if(n2%i==0)
                {
                    n2/=i;
                    lcm*=i;
                }
            }
        }

        System.out.println(lcm);
        
    }
}
