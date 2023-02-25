public class Q19_Palindrome {
    public static void main(String[] args) {
        int num = 5445;
        int temp=num;
        int rev = 0;
        int index = 0;

        while(temp!=0)
        {
            rev+=(temp%10)*(int)Math.pow(10, index);
            temp/=10;
            index++;
        }
        System.out.println(num);
        System.out.println(rev);
        if (num==rev) {
            System.out.println(num+ " is palindrome number");
        }else{
            System.out.println(num + " is not palindrome number");
        }
    }
}
