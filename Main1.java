class student
{
    int rollno;
    String name;
    String section;
    int marks;
    String address;
    
    void reading(){
        System.out.println(name+" reading");
    }
    void writing(){
        System.out.println(name+" writing");
    }
}
class Main1
{
    public static void main( String args[])
    {
        student std1=new student();
        std1.rollno=123;
        std1.name="daya";
        std1.section="A";
        std1.marks=99;
        std1.address="vijayawada";
        System.out.println("student1 information");
        System.out.println(std1.rollno+std1.name+std1.section+std1.marks+std1.address);
        std1.reading();
        std1.writing();
        student std2=new student();
        std2.rollno=567;
        std2.name="king";
        std2.section="B";
        std2.marks=89;
        std2.address="singapore";
        System.out.println("student2 information");
        System.out.println(std2.rollno+std2.name+std2.section+std2.marks+std2.address);
        std2.writing();
        std2.reading();
        
        
    }
}