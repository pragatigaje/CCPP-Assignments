class A
{
    static
    {
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }
    A()
    {
        System.out.println("A class constructor");
    }
    
}
public class Solution extends A
{
    static
    {
        System.out.println("static 2");
    }
    {
        System.out.println("instance 2");
    }
    Solution()
    {
        System.out.println("solution class constructor");
    }
    public static void main(String[] args) 
    {
       A a = new A();
    }
}
