import java.util.Scanner;
class even{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("given number is even");
        }
        else
        {
             System.out.println("given number is odd");
        }
    }
}