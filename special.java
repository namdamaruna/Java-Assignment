import java.util.Scanner;
class special{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character:");
        ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z'))
        {
            System.out.println("it is an alphabet");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("it is a digit");
        }
        else
        {
            System.out.println("it is a special char");
        }
    }
}