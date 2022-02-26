import java.util.*;
class Shopping
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee salary");
        int salary=sc.nextInt();
        System.out.println("enter shopping bill1");
        int sp1=sc.nextInt();
        System.out.println("enter shopping bill2");
        int sp2=sc.nextInt();
        System.out.println("enter shopping bill3");
        int sp3=sc.nextInt();
        int total=sp1+sp2+sp3;
        double percentage=total*100/salary;
        System.out.println("the total shopping amount"+total);
        System.out.println("percentage to spent the shopping"+percentage);
        
    }
}