class Student{
    int rollno=123;
    final void display(){
        System.out.println("Final Block");
    }
}
class Topper extends Student{
   // void display(){  // we get error because method overriding is not possible
        System.out.println("Topper Block");
    }
}
class FinalMethod{
    public static void main(String args[]){
        Student s= new Student();
        s.rollno=123;
        System.out.println(s.rollno);
        s.display();
    }
}