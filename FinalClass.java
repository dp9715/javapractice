final class Student {
    int rollno;
    void display(){
        System.out.println("Display ");
    }
}
class Topper extends Student{ // this is not possible
    void display(){
        System.out.println("Topper");
    }
}
class FinalClass{
    public static void main(String args[]){
        Student s = new Student();
        s.rollno=123;
        System.out.println(s.rollno);
        s.display();
    }
}