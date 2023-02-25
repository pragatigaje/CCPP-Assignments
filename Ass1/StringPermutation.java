package Ass1;

public class StringPermutation {

    public static void printPermutation(String str, String asf)
    {
        if(str.length() == 0)
        {
            System.out.println(asf);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            String leftString = str.substring(0, i);
            String righString = str.substring(i+1);
            String res = leftString+righString;
            printPermutation(res, asf+ch);
        }
    }
    public static void main(String[] args) {
        String str = "RAM";
        printPermutation(str, "");
    }
}
