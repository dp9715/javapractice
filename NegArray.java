import java.util.*;
class NegArray {
    public static void main(String argss[]){
        int n,count=0;
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
            if(a[i]<0){
                System.out.println("Negetive Elements are:");
                System.out.println(a[i]);
                count=count+1;
            }
        }
        System.out.println("Count:"+count);
    }
}