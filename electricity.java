import java.util.Scanner;
class electricity{
    public static void main(String args[])
    {
        double tu,bamut;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount:");
        tu=sc.nextInt();
        if(tu<50)
        {
            bamut=tu*0.50;
        }
        else if(tu<100)
        {
            bamut=(50*0.50)+((tu-50)*0.75);
        }
        else if(tu<200)
        {
            bamut=(50*0.50)+(50*0.75)+((tu-100)*2.56);
        }
        else
        {
            bamut=(50*0.50)+(50*0.75)+(100*2.56)+((tu-200)*5.67);
        }
        System.out.println("the electricity bill is:"+bamut);
    }
}