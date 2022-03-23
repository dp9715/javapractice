/*Create a class named 'Member' having the following members: 
Data members 1 - Name 2 - Age 3 - Phone number 4 - Address 5 - Salary 
It also has a method named 'printSalary' which prints the salary of the members. 
Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
Now, assign name, age, phone number,
address and salary to an employee and a manager by making an object of both of these classes and print the same.*/
class Member{
    String name;
    int age;
    long ph;
    String addr;
    int sal;
    
    void printsalary(int sal){
        this.sal=sal;
        System.out.println(sal);
    }
}
class Employee extends Member{
    String esp="JAVA";
    String edept="DEVELOP";
    void display(){
        System.out.println(esp+" "+super.name+" ");
        super.printsalary(25000);
    }
    
    
}
class Manager extends Member{
    String msp="PY";
    String mdept="ANALYST";
    void display(){
        System.out.println(msp+" "+super.name+" ");
        super.printsalary(35000);
    }
}
class PersonInheritance{
    public static void main(String args[]){
        Employee e=new Employee();
        e.name="XYZ";
        e.age=32;
        e.ph=965865868;
        e.addr="VIJ";
        System.out.println("Employee Details");
        System.out.println(e.name+" "+e.name+" "+e.age+" "+e.ph+" "+e.addr);
        e.display();
        Manager m = new Manager();
        m.name="SDHR";
        m.age=42;
        m.ph=965865868;
        m.addr="HYD";
        System.out.println("Manager Details");
        System.out.println(m.name+" "+m.name+" "+m.age+" "+m.ph+" "+m.addr);
        m.display();
    }
}