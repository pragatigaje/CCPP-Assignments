public class Q13_Smallest {
    public static void main(String[] args) {
        
        int a =10, b=20, c =2;

        int smallest = a < b ? ( a < c ? a : c ) : ( b < c ? b : c);

        System.out.println("Smallest Number : "+smallest);

    }

}
