class Student{
    String sname;
    int srollno;
    String s_section;
    int imarks;
    int emarks;
    int pmarks;
    
    void grade()
    {
     float total,percentage;
     total=imarks+emarks+pmarks;
     percentage=(total/300)*100;
     if(percentage<90&&percentage>=80)
     {
         System.out.println(total+": Total marks  ");
         System.out.println(" A Grade  :");

 

     } 
     else if(percentage<80&&percentage>=70)
     {
         System.out.println(total+": Total marks  ");
         System.out.println(" B Grade  :");
     } 
     else if(percentage<70&&percentage>=60)
     {
       System.out.println(total+": Total marks  ");
       System.out.println(" C Grade  :");  
     }
     else
     {
       
       System.out.println(total+" : Total marks  ");
       System.out.println(" Failed  :");    
     }
    }
   
}
class StudentMarks{
    public static void main(String args[]){
    Student std1 = new Student();
    std1.sname="Hari";
    std1.srollno=123;
    std1.s_section=" MECH ";
    std1.imarks= 80;
    std1.emarks= 75;
    std1.pmarks= 80;
    System.out.println("******Student 1 Details*******");  
    System.out.println("Name :"+std1.sname+"\n"+"Roll no :"+std1.srollno+"\n"+"Section :"+std1.s_section+"\n" + "Internal marks :"+std1.imarks+"\n"+"External Marks :"+std1.emarks+"\n"+"Project Marks :"+std1.pmarks);
    std1.grade();
    
    Student std2 = new Student();
    std2.sname="Hari";
    std2.srollno=456;
    std2.s_section=" Civil ";
    std2.imarks= 60;
    std2.emarks= 60;
    std2.pmarks= 60;
    System.out.println("******Student 2 Details*******");  
    System.out.println("Name :"+std2.sname+"\n"+"Roll no :"+std2.srollno+"\n"+"Section :"+std2.s_section+"\n" + "Internal marks :"+std2.imarks+"\n"+"External Marks :"+std2.emarks+"\n"+"Project Marks :"+std2.pmarks);
    std2.grade();
        
    }
}