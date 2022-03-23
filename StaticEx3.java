class SumOfDigits {
    static void sum(int a){
        int sum=0,rem;
        while (a>0){
            rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        System.out.println(sum);
    }
}
class StaticEx3{
    public static void main(String args[]){
        SumOfDigits.sum(513);
    }
}