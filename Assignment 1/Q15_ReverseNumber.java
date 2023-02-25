public class Q15_ReverseNumber {
    public static void main(String[] args) {
        int num =  4561;
        int temp = num;
        while(temp!=0)
        {
            System.out.print(temp%10);
            temp/=10;
        }
    }
}
