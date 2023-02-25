public class Q11_FactorsOfNumber {
    public static void main(String[] args) {
        int num = 56;
        for(int i=1; i<=num ; i++)
        {
            if(num%i==0)
                System.out.print(i+" ");
        }
    }
}
