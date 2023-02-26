public class Q1_Palindrome {
    public static void main(String[] args) {
        String str = "diid";
        String revstr ="";

        for (int i = 0; i < str.length() ; i++) {
            revstr= str.charAt(i)+revstr;
        }

        if(str.equals(revstr))
            System.out.println("Given String is Palindrome");
        else
            System.out.println("Given String is not Palindrome");
    }
}
