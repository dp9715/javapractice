class StudentDetails{
    int rollno;
    String name;
    String sec;
    int marks;
    String addr;
    static String college="GEC";
    static String state="AP";
    // if you eant to change the static value then use this block
    static{
        state="Telangana";
    }
    
    void reading(){
        System.out.println(name+" reading");
    }
    void writing(){
        System.out.println(name+" writing");
    }
}
class StaticEx4{
    public static void main(String args[]){
        StudentDetails std1=new StudentDetails();
        std1.rollno=123;
        std1.name="priyanka";
        std1.sec="A";
        std1.marks=75;
        std1.addr="VIJAYAWADA";
        
        System.out.println("Student 1 Information");
        System.out.println(std1.name+" "+std1.rollno+" "+StudentDetails.college+" "+StudentDetails.state);
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
        
        StudentDetails std3=new StudentDetails();
        std3.rollno=001;
        std3.name="ROSH";
        std3.sec="A";
        std3.marks=5;
        std3.addr="America";
        
    }
}