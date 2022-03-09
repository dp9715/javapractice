import java.util.Scanner;
class Max2num{
    public static void main(String args[]){
        int max=0,num1,num2;
        System.out.println("enter firts number");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        System.out.println("enter second number");
        num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("maximum number is " +num1);
            
        }
        else
        {
            System.out.println("maximum number is " +num2);
        }
    
        
    }
}