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
}
class clerk extends Employee{
    double PF(){
        double pf=(sal*2)/100;
        return pf;
    }
}

class MultiInheritance{
    public static void main(String args[]){
        clerk c = new clerk();
        c.sal=20000;
        double pf=c.PF();
        double totalsal=pf+c.sal;
        System.out.println(totalsal);
    }
}