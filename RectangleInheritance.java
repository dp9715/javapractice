/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' 
and two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. 
Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s)
calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.*/
class Rectangle{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area(){
       int area = l*b; 
       System.out.println(area);
    }
    void perimeter(){
       int perimeter=2*(l+b);
       System.out.println(perimeter);
    }
}
class Square extends Rectangle{
    Square(int s){
        super(s,s);
    }
}
class RectangleInheritance{
    public static void main(String args[]){
        Square sq = new Square(2);
        Rectangle r=new Rectangle(2,3);
        sq.area();
        sq.perimeter();
        r.area();
        r.perimeter();
    }
}