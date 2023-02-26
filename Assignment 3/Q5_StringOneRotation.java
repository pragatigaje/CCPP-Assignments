public class Q5_StringOneRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";

        if(s1.length()==s2.length())
        {
            s1=s1+s1;
            if(s1.indexOf(s2)!=-1)
            {
                System.out.println("Second string is a rotation of first string");  
            }
            else
            {
                System.out.println("Second string is not a rotation of first string");  
            }
        }
    }
}
