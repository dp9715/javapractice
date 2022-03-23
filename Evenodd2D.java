import java.util.*;
class Evenodd2D {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr row value");
        int row=sc.nextInt();
        System.out.println("Enetr col value");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        System.out.println("Enetr array Elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        //Display
        System.out.println("Even");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]%2==0){
                    System.out.print(a[i][j]);    
                }
                
            }
        }
        System.out.println("ODD");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]%2!=0){
                    System.out.print(a[i][j]);    
                }
                
            }
        }
        
    }
}
