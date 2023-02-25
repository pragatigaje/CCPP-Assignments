public class Q10_DigitsOfNumber {
    public static void main(String[] args) {
        int num = 4512;
        int temp = num;
        while(temp!=0)
        {
            System.out.println(temp%10);
            temp/=10;
        }
    }
}
