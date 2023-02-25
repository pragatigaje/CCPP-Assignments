public class Q24_PrintArmstrong {

    public static boolean isArmstrong(int num)
    {
        int temp = num;
        int count=0, sum=0;

        while(temp!=0)
        {
            temp/=10;
            count++;
        }
        
        temp=num;
        while(temp!=0)
        {
            int last = temp%10;
            sum+= Math.pow(last, count);
            temp/=10;
        }

        if(sum==num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int n = 1000;
        for(int i = 1 ; i < n ; i++)
        {
            if(isArmstrong(i))
                if(i==1 || i > 10)
                System.out.print(i+" ");
        }
    }
}
