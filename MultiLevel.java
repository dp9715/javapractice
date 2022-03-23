class Student{
    int sid;
    String sname;
    String Sec;
    String addr;
}
class Exam extends Student{
    float im;
    float em;
}
class Project extends Exam{
    float pro;
}
class Result extends Project {
    float percentage(){
         float sum=im+em+pro;
         float p=(sum/300)*100;
        if(p>=90){
                System.out.println("Grade A");
            }
            else if(p>=80){
                System.out.println("Grade B");
            }
            else if(p>=70){
                System.out.println("Grade C");
            }
            else if(p>=60){
                System.out.println("Grade D");
            }
            else if(p<40){
                System.out.println("Grade E");
            }
        return p;
        }   
    }    

class MultiLevel{
    public static void main(String args[]){
        Result r=new Result();
        r.im=75;
        r.em=75;
        r.pro=75;
        float percentage = r.percentage();
        System.out.println("Percentage: "+percentage);
    }
}