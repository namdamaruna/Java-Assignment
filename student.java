import java.util.Scanner;
class student{
    public static void main(String args[])
    {
        int num;
        String name;
        int maths,chemistry,hindi;
        float total,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student number:");
        num=sc.nextInt();
        System.out.println("enter student name:");
        name=sc.next();
        System.out.println("enter maths marks:");
        maths=sc.nextInt();
        System.out.println("enter chemistry marks:");
        chemistry=sc.nextInt();
        System.out.println("enter hindi marks:");
        hindi=sc.nextInt();
        
        total=maths+chemistry+hindi;
        avg=total/3;
        System.out.println("student number is:"+num);
        System.out.println("student name is :"+name);
        System.out.println("maths  marks :"+maths);
        System.out.println("chemistry marks :"+chemistry);
        System.out.println("hindi marks :"+hindi);
        System.out.println("total marks:"+total);
        System.out.println("student average:"+avg);  
    }
}
        
        