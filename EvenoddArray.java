import java.util.*;
class EvenoddArray {
    public static void main(String argss[]){
        int n,count1=0,count2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        n=sc.nextInt();
        int a[]= new int[n];
        // print array elements
        System.out.println("Array Elememnts");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.println("Even:");
                System.out.println(a[i]);
                count2=count2+1;
            }
            else if(a[i]%2!=0){
               System.out.println("ODD:");
               System.out.println(a[i]); 
               count1=count1+1;
            }
        }
        System.out.println("Odds are :"+count1);
        System.out.println("Evens are:"+count2);
    }
}
