import java.util.Scanner;
public class Bill
{
    public static void main(String args[])
    {
        double units=0,bi=0,gst=0,fi=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units");
        units=sc.nextDouble();
        bi=units*34.50;
        gst=(bi*18)/100;
        fi=bi+gst;
        System.out.println("bill"+bi);
        System.out.println("gst"+gst);
        System.out.println("final bill"+fi);
    }
}