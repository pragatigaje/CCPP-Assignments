public class Q16_GCD {
    public static void main(String[] args) {
        int num1 = 270, num2 = 192;
        int gcd =0;
        boolean flag = false;
        
        for(int i =1 ; i< Math.max(num1,num2); i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd = i;
                flag = true;
            }

        }

        if(flag==true)
            System.out.println(gcd);

    }
}
