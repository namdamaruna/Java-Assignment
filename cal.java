import java.util.Scanner;
class cal{
    public static void main(String args[])
    {
        int a,b,c,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("addition");
        System.out.println("substraction");
        System.out.println("multiplication");
        System.out.println("division");
        System.out.println("modulus");
        System.out.println("enter your choice:");
        ch=sc.nextInt();
        System.out.println("enter a,b values:");
        a=sc.nextInt();
        b=sc.nextInt();
        
        switch(ch)
        {
            case 1:
                c=a+b;
                System.out.println("addition value is"+c);
                break;
            case 2:
                c=a-b;
                System.out.println("substraction value is"+c);
                break;
            case 3:
                c=a*b;
                System.out.println("multiplication value is"+c);
                break;
            case 4:
                c=a/b;
                System.out.println("division value is"+c);
                break;
            case 5:
                c=a%b;
                System.out.println("modulus value is"+c);
                break;
            default:
                System.out.println("invalid");
            
        }
    }
}