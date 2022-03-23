class StudentDetails{
    int rollno;
    String name;
    String sec;
    int marks;
    String addr;
    
    StudentDetails(int r,String n,String s,int m,String a){
        rollno=r;
        name=n;
        sec=s;
        marks=m;
        addr=a;
    }
    StudentDetails(){
        
    }
    
    StudentDetails(int r){
        rollno=r;
    }
    
    void reading(){
        System.out.println(name+" reading");
    }
    void writing(){
        System.out.println(name+" writing");
    }
}
class Construc{
    public static void main(String args[]){
        StudentDetails std1=new StudentDetails(123,"Priyanka","A",75,"Vijayawada");
        
        System.out.println("Student 1 Information");
        System.out.println(std1.name+" "+std1.rollno);
        std1.reading();
        std1.writing();
        
        StudentDetails std2=new StudentDetails();
        std2.rollno=625;
        std2.name="sankeerth";
        std2.sec="A";
        std2.marks=95;
        std2.addr="VIJAYAWADA";
        
        System.out.println("Student 2 Information");
        System.out.println("std1 Roll"+std2.marks);
        std2.reading();
        std2.writing();
        
        StudentDetails std3=new StudentDetails(235);
        
    }
}