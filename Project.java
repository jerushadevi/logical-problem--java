import java.util.Scanner;
class Project{
    
    public static void main(String args[]){
        
        int pr=0,internal=0,external=0,total=0;
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter project marks");
        pr=s.nextInt();
        
     System.out.println("Enter External marks");
        external=s.nextInt();
    System.out.println("Enter internal marks");
        internal=s.nextInt();
    total=(project*70)/100+(external*20)/100+(internal*10)/100;
System.out.println("Total score is : "+total);
        
        
        
    }
}


