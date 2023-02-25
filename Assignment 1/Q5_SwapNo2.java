public class Q5_SwapNo2 {
    public static void main(String[] args) {
        int n1 = 100, n2 = 200;
        n1 = n1*n2;
        n2 = n1/n2;
        n1 = n1/n2;

        System.out.print(n1+" "+n2);
    }
}
