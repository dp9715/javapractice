class student
{
    int rollno;
    String name;
    String section;
    int internalmarks;
    int externalmarks;
    int projectmarks;
    
    
    void grade(){
        int total=internalmarks+externalmarks+projectmarks;
        System.out.println(total);
        float percetage=(total/300)*100;
        
        
        if (percetage<90 && percetage>=80)
        {
            
            System.out.println(name+" Grade A");
        }
        else if (percetage<80 && percetage>=70)
        {
            
            System.out.println(name+" Grade B");
        }
        else if (percetage<70 && percetage>=60)
        {
            
            System.out.println(name+" Grade C");
        }
        else
        {
            System.out.println(name+"Failed");
            
        }
        
    }
    
}
class Student1
{
    public static void main( String args[])
    {
        student std1=new student();
        std1.rollno=123;
        std1.name="ajay";
        std1.section="A";
        std1.internalmarks=99;
        std1.externalmarks=80;
        std1.projectmarks=80;
        System.out.println("student1 information");
        System.out.println(std1.rollno+std1.name+std1.section+std1.internalmarks+std1.externalmarks+std1.projectmarks);
        
        std1.grade();
        
        student std2=new student();
        std2.rollno=135;
        std2.name="ram";
        std2.section="B";
        std2.internalmarks=60;
        std2.externalmarks=75;
        std2.projectmarks=60;
        System.out.println("student2 information");
        System.out.println(std2.rollno+std2.name+std2.section+std2.internalmarks+std2.externalmarks+std2.projectmarks);
        
        std2.grade();
        
    }
}