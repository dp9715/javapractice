class calculator {
    static void cube(int a){
        System.out.println(a*a*a);
    }
}
class Staticex{
    public static void main(String args[]){
        calculator.cube(3);
    }
}