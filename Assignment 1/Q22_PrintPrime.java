public class Q22_PrintPrime {
    public static void main(String[] args) {
        int n = 10;
        boolean flag = false;

        for(int i = 2 ; i < n ; i++)
        {
            flag=false;
            if(i==2)
            {
                System.out.println(i+" ");
                continue;
            }
            for (int j =2 ; j < i; j++) 
            {
                if(i%j==0)
                {
                    flag=true;
                }
            }
            if(flag==false)
                System.out.println(i+" ");         
        }
    }
}
