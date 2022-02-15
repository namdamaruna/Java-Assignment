import java.util.Scanner;
class voting{
    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter person age");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("eligible to vote");
        }
        else
        {
            System.out.println("not eligible to vote");
        }
    }
}