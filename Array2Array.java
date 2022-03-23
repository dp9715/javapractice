import java.util.*;
class Array2Array {
    public static void main(String args[]){
        int n,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        n=sc.nextInt();
        int a[]=new int[n];
        int a1[]= new int[a.length];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            a1[i]=a[i];
        }
        System.out.println("Original Array");
        for (int i=0;i<a.length;i++){
            System.out.println("a["+i+"]= "+a[i]);
        }
        System.out.println("Copy of Array");
        for (int i=0;i<a1.length;i++){
            System.out.println("a1["+i+"]= "+a1[i]);
        }
    }
}