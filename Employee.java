import java.util.*;
class EmployeeDetail{
    int eid;
    String ename;
    String edept;
    int esal;
    String eaddr;
    void totalSal(){
        int grosssal,HRA,DA;
        if (esal>=10000 && esal<=20000){
            HRA=(esal*20)/100;
            DA=(esal*45)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
        else if (esal>20000 && esal<=40000){
            HRA=(esal*25)/100;
            DA=(esal*20)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        }
        else {
            HRA=(esal*30)/100;
            DA=(esal*30)/100;
            grosssal=esal+HRA+DA;
            System.out.println("GROSS SALARY:"+grosssal);
        } 
    }
}
class Employee{
    public static void main(String args[]){
        EmployeeDetail emp1= new EmployeeDetail();
        emp1.eid=123;
        emp1.ename="Anand";
        emp1.edept="Mech";
        emp1.eaddr="VIJ";
        emp1.esal=18000;
        System.out.println("Datails of Emp1");
        System.out.println(emp1.eid+emp1.ename+emp1.edept+emp1.eaddr+emp1.esal);
        emp1.totalSal();
        
        EmployeeDetail emp2= new EmployeeDetail();
        emp2.eid=456;
        emp2.ename="Ram";
        emp2.edept="Tech";
        emp2.eaddr="VIJ";
        emp2.esal=65000;
        System.out.println("Details of Emp2");
        System.out.println(emp2.eid+emp2.ename+emp2.edept+emp2.eaddr+emp2.esal);
        emp2.totalSal();
    }
}
