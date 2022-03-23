import java.util.*;
class Sumarray {
    public static void main(String argss[]){
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        n=sc.nextInt();
        int a[]= new int[n];
        // print array elements
        System.out.println("Array Elememnts");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}