class Employee{
    int eid;
    String name;
    int sal;
    String DOB;
    
    double HRA(){
        double hra=sal*20/100;
        return hra;
    }
}
class Manager extends Employee{
    double DA(){
        double da = sal*10/100;
        return da;
    }
}class Inheritance{
    public static void main(String args[]){
        Manager Priyanka = new Manager();
        Priyanka.sal=20000;
        System.out.println(Priyanka.sal);
        double d=Priyanka.DA();
        System.out.println(d);
        double h=Priyanka.HRA();
        System.out.println(h);
        double grosssal=Priyanka.HRA()+Priyanka.DA()+Priyanka.sal;
        System.out.println(grosssal);
    }
}