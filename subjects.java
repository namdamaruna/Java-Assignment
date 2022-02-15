import java.util.Scanner;
class subjects{
    public static void main(String args[])
    {
        int phy,che,mat,bio,com;
        float marks,percentage,totalmarks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks:");
        marks=sc.nextFloat();
        System.out.println("enter phy marks:");
        phy=sc.nextInt();
        System.out.println("enter che marks:");
        che=sc.nextInt();
        System.out.println("enter com marks:");
        com=sc.nextInt();
        System.out.println("enter bio marks:");
        bio=sc.nextInt();
        System.out.println("enter mat marks:");
        mat=sc.nextInt();
        totalmarks=phy+che+bio+mat+com;
        percentage=(marks/totalmarks)*100;
       
        
        if(percentage>=90)
        {
            System.out.println("Grade A");
        }
        else if(percentage>=80 && percentage<=90)
        {
            System.out.println("Grade B");
        }
         else if(percentage>=70 && percentage<=80)
        {
            System.out.println("Grade C");
        }
         else if(percentage>=60 && percentage>=70)
        {
            System.out.println("Grade D");
        }
         else if(percentage>=40 && percentage>=40)
        {
            System.out.println("Grade E");
        }
        else if(percentage<40)
        {
            System.out.println("Greade F");
        }
        else
        {
            System.out.println("inavalid");
        }
        System.out.println("marks"+marks);
        System.out.println("phy marks"+phy);
        System.out.println(" che marks"+che);
        System.out.println("bio marks"+bio);
        System.out.println("com marks"+com);
        System.out.println("totalmarks"+totalmarks);
        System.out.println("percentage"+percentage);
        
       
    }
}
        
        