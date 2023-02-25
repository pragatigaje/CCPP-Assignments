public class Q23_Armstrong {
    public static void main(String[] args) {
        int num =153;
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
            System.out.println(num+" is an armstrong number");
        else
            System.out.println(num+" is not an armstrong number");

    }
}
