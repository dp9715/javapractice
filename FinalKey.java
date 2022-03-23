class Student{
    final int rollno=123;
    void display(){
        System.out.println("Display");
    }
}
class FinalKey{
    public static void main(String args[]){
        Student s= new Student();
        //s.rollno=345; this is not possible beacause we have used final keyword
        System.out.println(s.rollno);
        s.display();
    }
}