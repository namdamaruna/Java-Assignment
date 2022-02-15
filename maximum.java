import java.util.Scanner;
class maximum{
    public static void main(String args[])
    {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        n1=sc.nextInt();
        System.out.println("enter first number");
        n2=sc.nextInt();
        System.out.println("enter first number");
        n3=sc.nextInt();
        if(n1>n2&&n1>n3)
        {
            System.out.println("the maximum number is"+n1);
        }
        else if(n2>n3)
        {
            System.out.println("the maximum number is"+n2);
        }
        else{
            System.out.println("the maximum number is"+n3);
        }    
    }
}
        