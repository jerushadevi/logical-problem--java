import java.util.Scanner;
class ArrElement{
    
    public static void main(String args[]){
      
      int arr[]={23,45,67,78,90,65,33,22};
      
      Scanner s=new Scanner(System.in);
      System.out.println("Enter search element");
      int key=s.nextInt();   // 33   50
         int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("Yes, the element is present in array");
        }
        else{
            System.out.println("No, Element is not found");
        }
        
      
      
           
    }
}
