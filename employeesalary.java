import java.util.Scanner;
class employeesalary{
    public static void main(String args[])
    {
 
        float da1,hra1,da,hra;
        float grosspay,basicsalary;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary:");
        basicsalary=sc.nextFloat();
        System.out.println("enter  DA:");
        da1=sc.nextFloat();
        System.out.println("enter HRA:");
        hra1=sc.nextFloat();
        da=(da1*basicsalary)/100;
        hra=(hra1*basicsalary)/100;
        grosspay=basicsalary+da+hra;
        System.out.println("gross salary of employee:"+grosspay);
    }
}
        