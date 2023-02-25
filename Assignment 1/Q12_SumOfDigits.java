public class Q12_SumOfDigits {
    public static void main(String[] args) {
        int num = 453;
        int sum=0, temp=num;

        while(temp!=0)
        {
            sum = sum + temp%10;
            temp/=10;
        }

        System.out.println(sum);
    }
}
