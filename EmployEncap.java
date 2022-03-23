import java.util.*;
class Employee{
    private int eid;
    private String ename;
    private int esal;
    void setEid(int eid){
        this.eid=eid;    
    }
    void setEname(String ename){
        this.ename=ename;
    }
    void setEsal(int esal){
        this.esal=esal;
    }
    int getEid(){
        return this.eid;
    }
    String getEname(){
        return this.ename;
    }
    int getEsal(){
        return this.esal;
    }
    
}
class EmployEncap{
    public static void main(String args[]){
        Employee e =new Employee();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Emp ID");
        int i=sc.nextInt();
        e.setEid(i);
        System.out.println("Enter Emp Name");
        String n = sc.next();
        e.setEname(n);
        System.out.println("Enter Emp Esal");
        int s=sc.nextInt();
        e.setEsal(s);
        System.out.println(e.getEid());
        System.out.println(e.getEname());
        System.out.println(e.getEsal());
        
        Employee emp2=new Employee();
        System.out.println("Enter EMP2 id");
        int i2=sc.nextInt();
        emp2.setEid(i2);
        System.out.println("Enter Emp2 Name");
        String n2=sc.next();
        emp2.setEname(n2);
        System.out.println("Enter Emp2 Esal");
        int s2=sc.nextInt();
        emp2.setEsal(s2);
        System.out.println(emp2.getEid());
        System.out.println(emp2.getEname());
        System.out.println(emp2.getEsal());
        
    }
}