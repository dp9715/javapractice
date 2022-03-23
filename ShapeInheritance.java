/*Create a class named 'Shape' with a method to print "This is This is shape". 
Then create two other classes named 'Rectangle', 
'Circle' inheriting the Shape class, 
both having a method to print "This is rectangular shape" and "This is circular shape" respectively.
Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
class Shape{
    void display(){
        System.out.println("This is Shape");
    }
}

class Square{
    void display(){
    System.out.println("Square is Rectangle");
        class Rectangle extends Shape{
            void display(){
                System.out.println("This is Rectangle");
                super.display();
            } 
        }  
    }
}
class Circle extends Shape{
    void display(){
        System.out.println("This is Circle");
    } 
}
class ShapeInheritance{
    public static void main(String args[]){
        Square s = new Square();
        s.display();
    }
}