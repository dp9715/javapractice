import java.util.*;
class EmployeeDetails{
    int eid;
    String ename;
    String edept;
    int esal;
    String eaddr;
    
    EmployeeDetails(int eid,String ename,String edept,int esal,String eaddr){
        this.eid=eid;
        this.ename=ename;
        this.edept=edept;
        this.esal=esal;
        this.eaddr=eaddr;
    }
    
    EmployeeDetails(int eid){
        this.eid=eid;
    }
    
    EmployeeDetails(String ename,String edept){
        this.EmployeeDetails(789);
        this.ename=ename;
        this.edept=edept;
    }
    
    EmployeeDetails(int esal,String eaddr){
        this.esal=esal;
        this.eaddr=eaddr;
    }
    
    void display(){
        System.out.println(eid+" "+ename+" "+edept+" "+esal+" "+eaddr);
    }
    void totalSal(){
        this.display();
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
class EmployeConst{
    public static void main(String args[]){
        EmployeeDetails emp1= new EmployeeDetails(123,"Priyanka","Technical",18000,"Vij");
        System.out.println("Datails of EMP 1");
        //emp1.display();
        emp1.totalSal();
        
        EmployeeDetails emp2= new EmployeeDetails(456);
        System.out.println("Details of EMP 2");
        //emp2.display();
        emp2.totalSal();
        
        EmployeeDetails emp3= new EmployeeDetails("JESSY","FRONTEND");
        System.out.println("Details of EMP 3");
        //emp3.display();
        emp3.totalSal();
        
        EmployeeDetails emp4= new EmployeeDetails("ROSH","BACKEND");
        System.out.println("Details of EMP 3");
        //emp4.display();
        emp4.totalSal();
        
    }
}