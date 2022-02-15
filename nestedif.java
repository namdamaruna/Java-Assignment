import java.util.Scanner;
class nestedif{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,c values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is big");
            }
            else
            {
                System.out.println("c is big");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is big");
            }
            else
            {
                System.out.println("c is big");
            }
        }
    }
}