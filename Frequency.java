import java.util.*;
class Frequency{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array:");
        int n,count=0,num;
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements of an array:");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter element to find Frequency");
        num=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==num){
                count=count+1;
            }
        }
        System.out.println("Frequency:"+count);
        if(count==0){
            System.out.println("Element not found");
        }
    }
}