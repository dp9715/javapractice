import java.util.*;
class ProdutArray {
    public static void main(String argss[]){
        int n,p=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        n=sc.nextInt();
        int a[]= new int[n];
        // print array elements
        System.out.println("Array Elememnts");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            p=p*a[i];
        }
        System.out.println(p);
    }
}