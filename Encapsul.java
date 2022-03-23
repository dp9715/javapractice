import java.util.*;
class Student{
    private int rollno;
    private String name;
    private String sec;
    void setRollno(int rollno){
        this.rollno=rollno;
    }
    void setName(String name){
        this.name=name;
    }
    void setSec(String sec){
        this.sec=sec;
    }
    int getRollno(){
        return this.rollno;
    }
    String getName(){
        return this.name;
    }
    String getSec(){
        return this.sec;
    }
}
class Encapsul{
    public static void main(String args[]){
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RollNo");
        int r=sc.nextInt();
        s.setRollno(r);
        System.out.println("Enter name");
        String n = sc.next();
        s.setName(n);
        String section=sc.next("Enter Section");
        s.setSec(section);
        System.out.println(s.getRollno());
        System.out.println(s.getName());
        System.out.println(s.getSec());
    }
}