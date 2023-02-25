public class Q17_LCM {
    public static void main(String[] args) {
        int n1 = 40, n2 = 210;
        int lcm = Math.max(n1,n2);
        while(true)
        {
            if(lcm%n1 == 0 && lcm%n2 == 0)
            {
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }
    }
}
