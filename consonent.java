import java.util.Scanner;
class consonent{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  alphabet:");
        ch=sc.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            switch(ch)
            {
                case 'a': case 'A':
                case 'e': case 'E':
                case 'i': case 'I':
                case 'o': case 'O':
                case 'u': case 'U':
                    System.out.println("vowel");
                    break;
                default:
                System.out.println("consonent");
            }
             
        }
        else
        {
            System.out.println("enter correct alphabet");
        }
       
            
    }
}
        