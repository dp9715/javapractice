import java.util.Scanner;
class Details
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        String name,adress,branch;
        char section;
        long phone;
        int rollno;
        System.out.println("Enter your name :");
        name=sc.nextLine();
        System.out.println("Enter Your Rollno :");
        rollno=sc.nextInt();
        System.out.println("Enter your Branch :");
        branch=sc.next();
        System.out.println("Enter your Section :");
        section=sc.next().charAt(0);
        System.out.println("Enter your Adress :");
        adress=sc.next();
   
    }
}
        
        
       
    