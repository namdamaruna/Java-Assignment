import java.util.Scanner;
class divisible{
    public static void main(String args[])
    {
        float num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        num=sc.nextFloat();
        if((num%5==0)&&(num%11==0))
        {
            System.out.println("number is divisible");
        }
        else
        {
            System.out.println("number is not divisible");
        }
    }
}
