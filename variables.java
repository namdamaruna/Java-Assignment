import java.util.Scanner;
class variables{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter variable");
        a=sc.nextInt();
        System.out.println("enter variable");
        b=sc.nextInt();
        System.out.println("enter variable");
        c=sc.nextInt();
        if(a==b&&b==c)
        {
            System.out.println("variables are equal");
        }
        else
        {
            System.out.println("variables are not equal");
        }
    }
}