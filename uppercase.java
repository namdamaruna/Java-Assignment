import java.util.Scanner;
class uppercase{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character:");
        ch=sc.next().charAt(0);
        if (ch>='A' && ch<='Z')
        {
            System.out.println("uppercase");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("lowercase");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}