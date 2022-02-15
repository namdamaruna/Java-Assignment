import java.util.Scanner;
class maximumtwo{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        n1=sc.nextInt();
        System.out.println("enter second number");
        n2=sc.nextInt();
        if(n1>n2)
        {
            System.out.println("a is maximum");
        }
        else
        {
            System.out.println("b is maximum");
        }
    }
}