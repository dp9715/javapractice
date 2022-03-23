class ArmStrong{
    static void arms(int a){
        int temp,sum=0,rem;
        temp=a;
        while (temp!=0){
            rem=temp%10;  
            temp=temp/10;  
            sum=sum+rem*rem*rem;
        }  
        System.out.println(sum);
        if(a==sum){
            System.out.println("Number is ARMSTRONG: "+sum);
        }
        else{
            System.out.println("Number is NOT ARMSTRONG: "+sum);
        }
    }
}
class ArmStrongStatic{
    public static void main(String args[]){
        ArmStrong.arms(153);
    }
}