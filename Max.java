import java.util.*;
class Max{
    public static void main (String args[]){
        int i,n,temp;
        System.out.println("enter size of an array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int [n];
         System.out.println("enter elements of an array");
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         for(i=0;i<n;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                 
             }
            
         }
         System.out.println("the largest element in the given array is :" +a[0]);
    }
    
}