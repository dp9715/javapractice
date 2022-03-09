import java.util.Scanner;
class Max3num {


    public static void main(String args[]){
        int max=0,num1,num2,num3;
        System.out.println("enter first number");
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        System.out.println("enter second number");
        num2=sc.nextInt();30
        System.out.println("enter third number");
        num3=sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println("maximum number is " +num1);
            
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("the maximum number is " +num2);
        }
        else
        {
            System.out.println("the maximum number is " +num3);
        }
        
    }
}